package com.shaurya.spring;

import com.shaurya.spring.aspects.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.shaurya.spring")
@EnableAspectJAutoProxy
public class ProjectConfig {
    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
    @Bean
    public LoggingAspect loggingAspect2() {
        return new LoggingAspect();
    }
}
