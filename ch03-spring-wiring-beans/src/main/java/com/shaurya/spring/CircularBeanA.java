package com.shaurya.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//Bad practice never use in application
@Component
public class CircularBeanA {
    private  final CircularBeanB circularBeanB;

    public CircularBeanB getCircularBeanB() {
        return circularBeanB;
    }

    @Autowired
    public CircularBeanA(@Lazy CircularBeanB circularBeanB) {
        this.circularBeanB = circularBeanB;
    }
}
