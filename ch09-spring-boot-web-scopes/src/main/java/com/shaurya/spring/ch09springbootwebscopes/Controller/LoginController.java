package com.shaurya.spring.ch09springbootwebscopes.Controller;

import com.shaurya.spring.ch09springbootwebscopes.Model.LoginProcessor;
import com.shaurya.spring.ch09springbootwebscopes.Service.LoggedUserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private final LoggedUserManagementService loggedUserManagementService;
    private final LoginProcessor loginProcessor;
    @Autowired
    public LoginController(LoginProcessor loginProcessor, LoggedUserManagementService loggedUserManagementService) {
        this.loginProcessor = loginProcessor;
        this.loggedUserManagementService = loggedUserManagementService;
    }
    @GetMapping("/")
    public String login() {
        return "login.html";
    }
    @PostMapping("/")
    public String login(
            @RequestParam String username,
            @RequestParam String password,
            Model model
    ) {
        loginProcessor.setUsername(username);
        loginProcessor.setPassword(password);

        boolean loggedIn = loginProcessor.login();
        if (loggedIn) {
            loggedUserManagementService.setUsername(username);
            return "redirect:/home";
        } else {
            model.addAttribute("message", "login failed");
        }
        return "login.html";
    }
}
