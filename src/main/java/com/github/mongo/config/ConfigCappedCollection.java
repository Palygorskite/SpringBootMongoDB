package com.github.mongo.config;

import com.github.mongo.pojo.CappedDO;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.CollectionOptions;
import org.springframework.data.mongodb.core.MongoTemplate;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * <p>
 * 创建时间为 19:32-2019-02-18
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Configuration
public class ConfigCappedCollection {

    @Resource
    private MongoTemplate template;

    @PostConstruct
    public void initCappedCollection() {
        if (!template.collectionExists(CappedDO.class)) {
            template.createCollection(CappedDO.class, CollectionOptions.empty().capped().maxDocuments(10).size(10000L));
        }
    }


}
