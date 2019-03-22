package com.github.mongo.repository;

import com.github.mongo.pojo.SimpleLogDO;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.scheduling.annotation.Async;

import java.util.concurrent.Future;

/**
 * <p>
 * 创建时间为 上午10:35-2019/1/15
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */


public interface SimpleLogRepository extends PagingAndSortingRepository<SimpleLogDO, String> {


    @Async
    Future<SimpleLogDO> findSimpleLogDOById(String id);

}
