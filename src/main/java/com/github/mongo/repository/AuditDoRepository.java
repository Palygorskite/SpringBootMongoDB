package com.github.mongo.repository;

import com.github.mongo.pojo.AuditDO;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * <p>
 * 创建时间为 20:01-2019-02-18
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */


public interface AuditDoRepository extends PagingAndSortingRepository<AuditDO, String> {
}
