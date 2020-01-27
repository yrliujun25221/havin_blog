package com.yichun.havinblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("resource/Mapper")
public class HavinBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(HavinBlogApplication.class, args);
    }

}
