package com.shaurya.spring.proxies;

import com.shaurya.spring.model.Comment;

public interface CommentNotificationProxy {
    public void sendComment(Comment comment);
}
