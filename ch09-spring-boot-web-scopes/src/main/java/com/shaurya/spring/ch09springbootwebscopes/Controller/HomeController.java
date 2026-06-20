package com.shaurya.spring.ch09springbootwebscopes.Controller;

import com.shaurya.spring.ch09springbootwebscopes.Service.LoggedUserManagementService;
import com.shaurya.spring.ch09springbootwebscopes.Service.LoginCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final LoginCountService loginCountService;
    private final LoggedUserManagementService loggedUserManagementService;
    @Autowired
    public HomeController(LoginCountService loginCountService, LoggedUserManagementService loggedUserManagementService){
        this.loginCountService = loginCountService;
        this.loggedUserManagementService = loggedUserManagementService;
    }
    @GetMapping("/home")
    public String home(Model model){
        String username = loggedUserManagementService.getUsername();
        String count = String.valueOf(loginCountService.getLoginCount());
        if(username==null){
            return "redirect:/";
        }
        model.addAttribute("username",username);
        model.addAttribute("count",count);
        return "home.html";
    }
}
