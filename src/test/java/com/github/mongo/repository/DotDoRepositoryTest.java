package com.github.mongo.repository;

import com.github.mongo.pojo.DotDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * <p>
 * 创建时间为 上午10:03-2019/1/29
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class DotDoRepositoryTest {

    @Autowired
    private DotDoRepository repository;

    @Test
    public void save() {
        DotDO dot = new DotDO();
        dot.setIp("1.1.1.3");
        repository.save(dot);
    }

}