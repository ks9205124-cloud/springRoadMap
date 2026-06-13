package com.shaurya.spring;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//Bad practice never use in application
@Component
public class CircularBeanB {
    private final CircularBeanA circularBeanA;

    public CircularBeanB(@Lazy CircularBeanA circularBeanA) {
        this.circularBeanA = circularBeanA;
    }
}
