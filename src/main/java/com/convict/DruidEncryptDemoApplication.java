package com.convict;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.convict.dao")
public class DruidEncryptDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DruidEncryptDemoApplication.class, args);
    }

}
