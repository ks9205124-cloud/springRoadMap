package com.shaurya.spring;

import com.shaurya.spring.service.CommentService;
import com.shaurya.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Before retrieving the CommentService");

        var commentService1 = context.getBean(CommentService.class);
        var commentService2 = context.getBean(CommentService.class);

        System.out.println("After retrieving the CommentService");

        boolean bool = commentService1 == commentService2;

        System.out.println(bool);
    }
}
