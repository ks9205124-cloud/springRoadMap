package com.shaurya.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sanctuary {
    private String name = "Ella's sanctuary";
    private final Parrot parrot;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    @Autowired
    public Sanctuary(Parrot parrot) {
        this.parrot = parrot;
    }
}
