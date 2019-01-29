package com.github.mongo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;

import javax.annotation.PostConstruct;

/**
 *
 * 当 key 中存在小数点的时候, key 需要转换,该模块为转换器
 * 加入这个模块以后 key 中如果有小数点,查出和写入会自动转换
 *
 * <p>
 * 创建时间为 上午9:53-2019/1/29
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Configuration
public class MongoDotConverterConfig {

    private final MappingMongoConverter mongoConverter;

    public MongoDotConverterConfig(MappingMongoConverter mongoConverter) {
        this.mongoConverter = mongoConverter;
    }

    @PostConstruct
    public void setUpKeyDotConverter() {
        mongoConverter.setMapKeyDotReplacement("-\\*dot\\*-");
    }


}
