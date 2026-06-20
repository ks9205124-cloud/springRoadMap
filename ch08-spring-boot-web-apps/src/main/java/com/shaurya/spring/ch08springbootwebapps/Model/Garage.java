package com.shaurya.spring.ch08springbootwebapps.Model;

public class Garage {
    public String name;
    public String model;
    public float price;

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
