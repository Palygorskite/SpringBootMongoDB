package com.github.mongo.controller;

import com.github.mongo.pojo.SimpleLogDTO;
import com.github.mongo.service.SimpleLogService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 创建时间为 上午10:34-2019/1/15
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@RestController
public class SimpleLogController {

    private final SimpleLogService service;

    public SimpleLogController(SimpleLogService service) {
        this.service = service;
    }

    /**
     * 在 SpringDataJPA 中如果传入的对象 id 为空则为新增对象,如果 id 不为空 则为更新对象
     *
     * @param simpleLogDTO 需要保存对的对象
     * @return 被保存的对象, 注意 ID
     */
    @PostMapping("/simplelog")
    public SimpleLogDTO save(@RequestBody SimpleLogDTO simpleLogDTO) {
        return service.save(simpleLogDTO);
    }


}
