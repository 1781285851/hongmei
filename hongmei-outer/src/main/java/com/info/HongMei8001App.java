package com.info;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication	//禁止springboot自动加载持久化bean
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
public class HongMei8001App
{
    public static void main(String[] args)
    {
        SpringApplication.run(HongMei8001App.class, args);
    }

}
