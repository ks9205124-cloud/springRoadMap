package com.shaurya.spring;

import com.shaurya.spring.respository.CommentRepository;
import com.shaurya.spring.service.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = "com.shaurya.spring")
public class ProjectConfig {
    @Bean
    @Lazy
    public CommentService commentService(CommentRepository commentRepository) {
        return new CommentService(commentRepository);
    }
}
