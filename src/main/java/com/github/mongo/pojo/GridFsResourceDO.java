package com.github.mongo.pojo;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;

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



@Getter
@Setter
public class GridFsResourceDO {

    /**
     * 文件的名称
     */
    private String name;

    /**
     * 文件的本地路径
     */
    private String path;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
