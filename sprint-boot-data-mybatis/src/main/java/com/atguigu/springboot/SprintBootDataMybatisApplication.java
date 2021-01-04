package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//mapper 注解扫描，可省去mapper接口加@Mapper注解
//@MapperScan(value = "com.atguigu.springboot.mapper")
@SpringBootApplication
public class SprintBootDataMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprintBootDataMybatisApplication.class, args);
    }

}
