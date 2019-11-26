package com.info.configration;

import com.github.pagehelper.PageInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class cfg
{
    @Bean
    public PageInterceptor pagehelper(){
        return new PageInterceptor();
    }
}
