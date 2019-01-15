package com.github.mongo.controller;

import com.github.mongo.pojo.PartitionLogDTO;
import com.github.mongo.service.PartitionLogService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



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

@RestController
public class PartitionLogController {

    private final PartitionLogService service;

    public PartitionLogController(PartitionLogService service) {
        this.service = service;
    }

    @PostMapping("/partition")
    public PartitionLogDTO save(@RequestBody PartitionLogDTO partitionLogDTO) {
        return service.save(partitionLogDTO);
    }


}
