package com.shaurya.spring;

import com.shaurya.spring.model.Comment;
import com.shaurya.spring.proxies.EmailCommentNotificationProxy;
import com.shaurya.spring.repositories.DBCommentRepositories;
import com.shaurya.spring.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var commentService = context.getBean(CommentService.class);
        var comment = new Comment();
        comment.setText("This is a comment");
        comment.setAuthor("Shaurya");

        commentService.publishComment(comment);
    }
}
