package com.shaurya.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Crow {
    public String name;
    @PostConstruct
    public void init(){
        System.out.println("Crow init");
        this.name="Jack";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
