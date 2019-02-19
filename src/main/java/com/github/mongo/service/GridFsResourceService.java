package com.github.mongo.service;

import com.github.mongo.dao.GridFsResourceDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 创建时间为 上午10:54-2019/1/15
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Service
public class GridFsResourceService {

    @Resource
    private GridFsResourceDao resourceDao;

    public String save(String name, String path) {
        return resourceDao.save(name, path);
    }

}
