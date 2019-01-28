package com.github.mongo.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 2.1.2 之后引用对象前面要加@
 *
 * <p>
 * 创建时间为 下午2:38-2019/1/15
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Data
@Document(collection = "#{@cname.getCollectionName()}")
public class PartitionLogDTO {

    @Id
    private String id;

    @Indexed
    private String name;

}
