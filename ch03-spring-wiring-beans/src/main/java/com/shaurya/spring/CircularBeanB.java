package com.shaurya.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//Bad practice never use in application
@Component
public class CircularBeanB {
    private final CircularBeanA circularBeanA;
    @Autowired
    public CircularBeanB(@Lazy CircularBeanA circularBeanA) {
        this.circularBeanA = circularBeanA;
    }
}
