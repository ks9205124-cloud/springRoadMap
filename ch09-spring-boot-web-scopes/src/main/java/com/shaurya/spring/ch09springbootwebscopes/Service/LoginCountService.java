package com.shaurya.spring.ch09springbootwebscopes.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope
public class LoginCountService {
    private int loginCount;
    public int getLoginCount() {
        return loginCount;
    }
    public void incrementLoginCount() {
        loginCount++;
    }
}
