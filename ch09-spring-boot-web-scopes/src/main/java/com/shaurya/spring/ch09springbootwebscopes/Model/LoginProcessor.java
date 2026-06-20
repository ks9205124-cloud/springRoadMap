package com.shaurya.spring.ch09springbootwebscopes.Model;

import com.shaurya.spring.ch09springbootwebscopes.Service.LoginCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {
    private String username;
    private String password;

    private final LoginCountService loginCountService;
    @Autowired
    public LoginProcessor(LoginCountService loginCountService) {
        this.loginCountService = loginCountService;
    }
    public boolean login(){
        loginCountService.incrementLoginCount();
        String username = this.username;
        String password = this.password;

        if("Shaurya".equals(username) && "1234".equals(password)){
            return true;
        }
        return false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
