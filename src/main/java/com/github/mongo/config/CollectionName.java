package com.github.mongo.config;

import org.joda.time.DateTime;
import org.springframework.context.annotation.Configuration;





/**
 * <p>
 * 创建时间为 下午2:33-2019/1/15
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Configuration("cname")
public class CollectionName {

    public String getCollectionName() {
        DateTime dateTime = DateTime.now();
        System.out.println("CollectionName:getCollectionName");
        return dateTime.toString("yyyy-MM-dd HH:mm");
    }

}
