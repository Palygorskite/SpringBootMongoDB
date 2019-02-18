package com.github.mongo.dao;

import com.github.mongo.pojo.SimpleLogDO;
import com.mongodb.client.result.UpdateResult;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 创建时间为 上午11:02-2019/1/15
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */


@Repository
public class MongoTemplateDao {

    private final MongoTemplate mongoTemplate;

    public MongoTemplateDao(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public List<SimpleLogDO> updateAll() {
        Update update = new Update();
        UpdateResult result = mongoTemplate.updateMulti(new Query(), update, SimpleLogDO.class);
        return null;
    }

}
