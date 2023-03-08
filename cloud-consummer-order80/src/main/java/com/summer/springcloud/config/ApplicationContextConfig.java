package com.summer.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author summer
 * @create 2023-03-08 13:10
 * @Description
 */
@Configuration
public class ApplicationContextConfig  {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
