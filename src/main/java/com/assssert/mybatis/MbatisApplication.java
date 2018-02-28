package com.assssert.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.assssert.mybatis.entity")
@SpringBootApplication
public class MbatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MbatisApplication.class, args);
	}
}
