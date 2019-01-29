package com.github.mongo.dao;

import lombok.SneakyThrows;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsOperations;
import org.springframework.data.mongodb.gridfs.GridFsResource;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import static org.springframework.data.mongodb.core.query.Criteria.where;


/**
 * <p>
 * 创建时间为 上午10:56-2019/1/15
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */


@Repository
public class GridFsResourceDao {

    private final GridFsOperations operations;

    public GridFsResourceDao(GridFsOperations operations) {
        this.operations = operations;
    }

    @SneakyThrows(FileNotFoundException.class)
    public String save(String fileName, String filePath) {
        InputStream inputStream = new FileInputStream(new File(filePath));
        operations.store(inputStream, fileName);
        return fileName;
    }

    @SneakyThrows(IOException.class)
    public String get(String fileName) {
        GridFsResource resource = operations.getResource(fileName);
        InputStream inputStream = resource.getInputStream();
        return null;
    }

    public String delete(String fileName) {
        operations.delete(new Query(where("filename").is(fileName)));
        return null;
    }


}
