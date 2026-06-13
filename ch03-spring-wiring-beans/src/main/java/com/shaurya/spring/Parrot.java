package com.shaurya.spring;

public class Parrot {
    public String getName() {
        return name;
    }
    public Parrot(){
        System.out.println("Parrot Constructed");
    }
    @Override
    public String toString() {
        return "Parrot : "+name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String name;
}
