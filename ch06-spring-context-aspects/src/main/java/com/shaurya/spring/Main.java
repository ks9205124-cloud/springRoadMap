package com.shaurya.spring;

import com.shaurya.spring.model.Comment;
import com.shaurya.spring.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setAuthor("Shaurya");
        comment.setText("Hello World");

        String value = service.publishComment(comment);
        service.deleteComment(comment);
        logger.info(value);
    }
}
