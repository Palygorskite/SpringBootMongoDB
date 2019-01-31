package com.github.mongo.controller;

import com.github.mongo.pojo.UserFluxDTO;
import com.github.mongo.repository.UserFluxRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * <p>
 * 创建时间为 下午3:37-2019/1/31
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */


@RestController
public class UserFluxController {

    private final UserFluxRepository repository;

    public UserFluxController(UserFluxRepository repository) {
        this.repository = repository;
    }

    @PostMapping("userflux")
    public Mono<UserFluxDTO> getUserFluxDTO(@RequestBody UserFluxDTO userFluxDTO) {
        return repository.save(userFluxDTO);
    }


}
