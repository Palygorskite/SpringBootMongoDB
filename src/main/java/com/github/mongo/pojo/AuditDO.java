package com.github.mongo.pojo;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Transient;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * <p>
 * 创建时间为 19:58-2019-02-18
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Getter
@Setter
@Document(collection = "AuditDO")
public class AuditDO {

    @CreatedDate
    @Field("created_date")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdDate;

    @LastModifiedDate
    @Field("last_modified_date")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifiedDate;

    /**
     * 被 {@link Transient} 标记的字段将不会保存到数据库中
     */
    @Transient
    private Long temp;


    @Version
    private Long version;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
