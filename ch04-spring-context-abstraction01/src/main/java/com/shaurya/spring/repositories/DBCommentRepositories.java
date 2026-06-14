package com.shaurya.spring.repositories;

import com.shaurya.spring.model.Comment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class DBCommentRepositories implements CommentRepositories{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
