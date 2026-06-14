package com.shaurya.spring.services;

import com.shaurya.spring.model.Comment;
import com.shaurya.spring.proxies.CommentNotificationProxy;
import com.shaurya.spring.repositories.CommentRepositories;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private final CommentNotificationProxy commentNotificationProxy;
    private final CommentRepositories commentRepositories;

    public CommentService(@Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy, CommentRepositories commentRepositories) {
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepositories = commentRepositories;
    }
    public void publishComment(Comment comment) {
        commentNotificationProxy.sendComment(comment);
        commentRepositories.storeComment(comment);
    }
}
