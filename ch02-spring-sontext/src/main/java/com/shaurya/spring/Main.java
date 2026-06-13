package com.shaurya.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.print.DocFlavor;
import java.util.function.Supplier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        //Adding Beans using @Bean annotation
        System.out.println(" Adding Beans using @Bean annotation");
        Parrot parrot1 = context.getBean(Parrot.class);
        System.out.println(parrot1.getName());
        Parrot parrot2 = context.getBean("parrot2",Parrot.class);
        System.out.println(parrot2.getName());
        Parrot parrot3 = context.getBean("parrot3",Parrot.class);
        System.out.println(parrot3.getName());
        //Adding Beans using stereotype annotation
        System.out.println(" Adding Beans using stereotype annotation");
        Crow crow = context.getBean(Crow.class);
        System.out.println(crow.getName());

        // Programmatically adding beans to the Spring context
        System.out.println(" Programmatically adding beans to the Spring context");
        Sparrow x = new Sparrow();
        x.setName("piko");

        Supplier<Sparrow> sparrowSupplier = () -> x;

        context.registerBean(Sparrow.class,sparrowSupplier);

        Sparrow sparrow = context.getBean(Sparrow.class);
        System.out.println(sparrow.getName());

        //Context to primitive data types
        System.out.println(" Spring context to primitive data types");
        String hello = context.getBean(String.class);
        System.out.println(hello);
        int ten = context.getBean(Integer.class);
        System.out.println(ten);
    }
}
