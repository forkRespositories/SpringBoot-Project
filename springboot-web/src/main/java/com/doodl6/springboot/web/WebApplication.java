package com.doodl6.springboot.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Profile;

@SpringBootApplication(scanBasePackages = "com.doodl6")
@MapperScan("com.doodl6.springboot.dao.api")
@ServletComponentScan
@EnableCaching
public class WebApplication {

    public static void main(String[] args) {
        System.setProperty("es.set.netty.runtime.available.processors","false");
        SpringApplication.run(WebApplication.class, args);
    }

}
