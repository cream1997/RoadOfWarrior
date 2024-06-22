package com.cream.row;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.cream.row.mapper")
@SpringBootApplication
public class RowBackendApp {

    public static void main(String[] args) {
        SpringApplication.run(RowBackendApp.class, args);
    }
}
