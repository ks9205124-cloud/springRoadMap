package com.shaurya.spring;

import org.springframework.beans.factory.annotation.Qualifier;
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
    //Wiring the beans using a direct method call between the @Bean methods
    @Bean
    @Primary
    public Person person1(){
        Person person = new Person();
        person.setName("Mike");
        person.setParrot(parrot1());
        return person;
    }
    //Wiring the beans using the @Bean annotated method’s parameters
    @Bean
    public Person person2(@Qualifier("parrot2") Parrot parrot){
        Person person = new Person();
        person.setName("Mike");
        person.setParrot(parrot);
        return person;
    }
}
