package com.github.mongo.repository;

import com.github.mongo.pojo.UserFluxDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Mono;


/**
 * <p>
 * 创建时间为 下午2:30-2019/1/31
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserFluxRepositoryTest {

    @Autowired
    private UserFluxRepository repository;

    @Test
    public void save() {
        long before = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            Mono<UserFluxDTO> mono = repository.save(getUserFluxDTO());
        }
        System.out.println("Cost:" + (System.currentTimeMillis() - before));
    }


    private static UserFluxDTO getUserFluxDTO() {
        UserFluxDTO fluxDTO = new UserFluxDTO();
//        fluxDTO.setEmail(DataUtils.getEmail(5, 10));
//        fluxDTO.setImei(DataUtils.getIMEI());
//        fluxDTO.setImsi(DataUtils.getImsi());
//        fluxDTO.setIp(DataUtils.getRandomIp());
//        fluxDTO.setName(DataUtils.getRandomString(10));
//        fluxDTO.setMac(DataUtils.getMac());
//        fluxDTO.setPhone(DataUtils.getTelephone());
        return fluxDTO;
    }

}