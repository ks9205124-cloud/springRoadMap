package com.shaurya.spring.ch11springbootconsumingrestendpoints;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(
        basePackages = "com.shaurya.spring"
)
public class ProjectConfig {
}
