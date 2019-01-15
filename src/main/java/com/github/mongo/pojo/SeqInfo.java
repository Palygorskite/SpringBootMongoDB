package com.github.mongo.pojo;

import lombok.Data;
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


@Document(collection = "sequence")
@Data
public class SeqInfo {

    @Id
    private String id;

    @Field
    private String collName;

    @Field
    private Long seqId;

    public SeqInfo() {
    }

}
