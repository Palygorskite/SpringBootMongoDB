package com.github.mongo.pojo;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * <p>
 * 创建时间为 19:52-2019-02-18
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Getter
@Setter
@AllArgsConstructor
@Document(collection = "ExpireDO")
public class ExpireDO {

    /**
     * 创建 ttl 的集合, 创建改集合时需要设置 ttl 字段, 特别要注意, 该字段 存入的数据类型为 Date
     * 用来设置集合中 文档到期的秒数。如果没有设置，则默认为-1
     * 60 秒之后过期
     */
    @Indexed(name = "ttl", expireAfterSeconds = 7)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date expire;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
