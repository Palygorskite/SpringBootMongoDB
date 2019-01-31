package com.github.mongo.pojo;


import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * <p>
 * 创建时间为 下午2:24-2019/1/31
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */


@Getter
@Setter
@Document(collection = "UserFluxDTO")
public class UserFluxDTO {

    @Id
    private String id;

    @Indexed
    private String name;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
