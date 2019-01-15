package com.github.mongo.config;


import com.github.mongo.pojo.SeqInfo;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.Nullable;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.util.ReflectionUtils;

import javax.persistence.GeneratedValue;
/**
 * <p>
 * 创建时间为 上午11:26-2019/1/15
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */


@Component
public class SaveEventListener<E> extends AbstractMongoEventListener<E> {

    private final MongoTemplate mongoTemplate;

    public SaveEventListener(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void onBeforeConvert(@Nullable BeforeConvertEvent<E> source) {
        Assert.notNull(source, "");
        E target = source.getSource();
        ReflectionUtils.doWithFields(source.getSource().getClass(), field -> {
            ReflectionUtils.makeAccessible(field);
            // 如果字段添加了GeneratedValue注解
            if (field.isAnnotationPresent(GeneratedValue.class)) {
                // 设置自增ID
                field.set(target, getNextId(target.getClass().getSimpleName()));
            }
        });
    }

    /**
     * 自定义自动生成 ID
     *
     * @param collName 列名
     * @return 返回 ID
     */
    private String getNextId(String collName) {
        Query query = new Query(Criteria.where("collName").is(collName));
        Update update = new Update();
        update.inc("seqId", 1);
        FindAndModifyOptions options = new FindAndModifyOptions();
        options.upsert(true);
        options.returnNew(true);
        SeqInfo seq = mongoTemplate.findAndModify(query, update, options, SeqInfo.class);
        Assert.notNull(seq, "");
        return StringUtils.substring((seq.getSeqId() + 1000000) + "", 1);
    }
}
