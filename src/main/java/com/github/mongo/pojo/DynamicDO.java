package com.github.mongo.pojo;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * <p>
 * 创建时间为 19:46-2019-02-18
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Getter
@Setter
@Document(collection = "#{@cname.getCollectionName()}")
public class DynamicDO {

    @Id
    private String id;

    @Indexed
    private Date date;

    public DynamicDO(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
