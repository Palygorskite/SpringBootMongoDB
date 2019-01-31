package com.github.mongo.repository;

import com.github.mongo.pojo.UserFluxDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * <p>
 * 创建时间为 下午2:25-2019/1/31
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */


public interface UserFluxRepository extends ReactiveMongoRepository<UserFluxDTO, String> {

}

