package com.github.mongo.repository;

import com.github.mongo.pojo.PartitionLogDTO;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * <p>
 * 创建时间为 下午2:39-2019/1/15
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */


public interface PartitionLogRepository extends PagingAndSortingRepository<PartitionLogDTO, String> {

}
