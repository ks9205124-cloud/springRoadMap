package com.shaurya.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.shaurya.spring")
public class ProjectConfig {
    @Bean
    @Primary
    public Parrot parrot1(){
        Parrot parrot = new Parrot();
        parrot.setName("koko");
        return parrot;
    }
    @Bean
    public Parrot parrot2(){
        Parrot parrot = new Parrot();
        parrot.setName("miki");
        return parrot;
    }
    @Bean
    public Parrot parrot3(){
        Parrot parrot = new Parrot();
        parrot.setName("riki");
        return parrot;
    }
    @Bean
    public String hello(){
        return "hello";
    }
    @Bean
    public int ten(){
        return 10;
    }
}
