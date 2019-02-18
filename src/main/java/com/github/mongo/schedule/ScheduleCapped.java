package com.github.mongo.schedule;

import com.github.mongo.pojo.CappedDO;
import com.github.mongo.repository.CappedDoRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * <p>
 * 创建时间为 19:37-2019-02-18
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */


@Component
public class ScheduleCapped {

    @Resource
    private CappedDoRepository repository;

    @Scheduled(fixedDelay = 1000)
    public void task() {
        repository.save(new CappedDO(new Date()));

    }

}
