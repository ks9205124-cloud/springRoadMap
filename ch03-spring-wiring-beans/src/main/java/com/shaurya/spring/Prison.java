package com.shaurya.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Prison {
    private String name = "Ella's prison";
    private Prison prison;

    public Prison getPrison() {
        return prison;
    }
    @Autowired
    public void setPrison(Prison prison) {
        this.prison = prison;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
