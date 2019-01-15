package com.github.mongo.pojo;

import lombok.Data;

/**
 * <p>
 * 创建时间为 上午10:53-2019/1/15
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Data
public class GridFsResourceDTO {

    /**
     * 文件的名称
     */
    private String name;

    /**
     * 文件的本地路径
     */
    private String path;

}
