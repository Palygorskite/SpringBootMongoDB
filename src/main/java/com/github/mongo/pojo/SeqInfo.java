package com.github.mongo.pojo;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * <p>
 * 创建时间为 上午11:29-2019/1/15
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */


@Getter
@Setter
@Document(collection = "sequence")
public class SeqInfo {

    @Id
    private String id;

    @Field
    private String collName;

    @Field
    private Long seqId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
