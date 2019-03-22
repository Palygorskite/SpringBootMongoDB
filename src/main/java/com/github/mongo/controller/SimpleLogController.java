package com.github.mongo.controller;

import com.github.mongo.pojo.SimpleLogDO;
import com.github.mongo.repository.SimpleLogRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.concurrent.Future;

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

    @Resource
    private SimpleLogRepository repository;

    @GetMapping("/simple")
    public Page<SimpleLogDO> get(@PageableDefault(size = 4, page = 1, sort = "id,asc") Pageable pageable) {
        return repository.findAll(pageable);
    }

    @GetMapping("/simple/{id}")
    public Future<SimpleLogDO> getAsync(@PathVariable String id) {
        return repository.findSimpleLogDOById(id);
    }


    /**
     * 在 SpringDataJPA 中如果传入的对象 id 为空则为新增对象,如果 id 不为空 则为更新对象
     *
     * @param simpleLogDTO 需要保存对的对象
     * @return 被保存的对象, 注意 ID
     */
    @PostMapping("/simple")
    public SimpleLogDO save(@RequestBody SimpleLogDO simpleLogDTO) {
        return repository.save(simpleLogDTO);
    }

    @PostConstruct
    public void init() {
        int num = 100;
        for (int i = 0; i < num; i++) {
            String data = "data:" + i;
            SimpleLogDO simpleLogDO = new SimpleLogDO();
            simpleLogDO.setId(i + "");
            simpleLogDO.setMessage(data);
            simpleLogDO.setField(data);
            repository.save(simpleLogDO);
        }
    }

    @PreDestroy
    public void destroy() {
        repository.deleteAll();
    }


}
