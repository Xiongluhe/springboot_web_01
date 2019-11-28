package com.xiong.springboot_web_01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.xiong")
@MapperScan("com.xiong.dao")
public class SpringbootWeb01Application {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootWeb01Application.class, args);
	}
	
}
