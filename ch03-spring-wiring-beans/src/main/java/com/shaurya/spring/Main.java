package com.shaurya.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = context.getBean(Parrot.class);
        Person person1 = context.getBean(Person.class);
        Person person2 = context.getBean("person2",Person.class);
        Zoo zoo = context.getBean(Zoo.class);
        Sanctuary sanctuary = context.getBean(Sanctuary.class);
        Prison prison = context.getBean(Prison.class);

        //dependency injection using classical methods
        System.out.println(" dependency injection using classical methods");
        System.out.println("Parrot name: " + parrot.getName());
        System.out.println("Person name: " + person1.getName());
        System.out.println("Persons parrot: " + person1.getParrot());
        System.out.println("Person name: " + person2.getName());
        System.out.println("Persons parrot: " + person2.getParrot());
        //dependency injection using autowired annotations
        //Using @Autowired to inject the values through the class fields
        System.out.println(" Using @Autowired to inject the values through the class fields");
        System.out.println("Zoo's name: " + zoo.getName());
        System.out.println("Zoo's parrot: " + zoo.getParrot());
        //Using @Autowired to inject the values through the constructor
        System.out.println(" Using @Autowired to inject the values through the constructor");
        System.out.println("Sanctuary's name: " + sanctuary.getName());
        System.out.println("Sanctuary's parrot: " + sanctuary.getParrot());
        //Using dependency injection through the setter
        System.out.println(" Using dependency injection through the setter");
        System.out.println("Zoo's name: " + sanctuary.getName());
        System.out.println("Zoo's parrot: " + prison.getPrison());
    }
}
