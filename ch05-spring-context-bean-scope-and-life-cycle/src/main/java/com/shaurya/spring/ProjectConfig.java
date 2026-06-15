package com.shaurya.spring;

import com.shaurya.spring.respository.CommentRepository;
import com.shaurya.spring.service.CommentService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.shaurya.spring")
public class ProjectConfig {
    @Bean
    @Lazy
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public CommentService commentService(CommentRepository commentRepository) {
        return new CommentService(commentRepository);
    }
}
