package com.github.mongo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Set;

/**
 * <p>
 * 创建时间为 09:34-2019-02-19
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Configuration
public class ConfigCollection {

    @Resource
    public MongoTemplate template;

    @PostConstruct
    public void init() {
        Set<String> set = template.getCollectionNames();
        set.forEach(one -> template.dropCollection(one));
    }

}
