package com.github.mongo.repository;

import com.github.mongo.pojo.CappedDO;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * <p>
 * 创建时间为 19:39-2019-02-18
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */


public interface CappedDoRepository extends PagingAndSortingRepository<CappedDO, String> {
}
