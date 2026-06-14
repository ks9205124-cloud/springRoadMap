package com.shaurya.spring.services;

import com.shaurya.spring.model.Comment;
import com.shaurya.spring.proxies.CommentNotificationProxy;
import com.shaurya.spring.repositories.CommentRepositories;

public class CommentService {
    private final CommentNotificationProxy commentNotificationProxy;
    private final CommentRepositories commentRepositories;

    public CommentService(CommentNotificationProxy commentNotificationProxy, CommentRepositories commentRepositories) {
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepositories = commentRepositories;
    }
    public void publishComment(Comment comment) {
        commentNotificationProxy.sendComment(comment);
        commentRepositories.storeComment(comment);
    }
}
