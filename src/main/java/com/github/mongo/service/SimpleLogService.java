package com.github.mongo.service;

import com.github.mongo.pojo.SimpleLogDO;
import com.github.mongo.repository.SimpleLogRepository;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 创建时间为 上午10:37-2019/1/15
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Service
public class SimpleLogService {

    private final SimpleLogRepository repository;

    public SimpleLogService(SimpleLogRepository repository) {
        this.repository = repository;
    }

    public SimpleLogDO save(SimpleLogDO mongoLogsDTO) {
        return repository.save(mongoLogsDTO);
    }

}
