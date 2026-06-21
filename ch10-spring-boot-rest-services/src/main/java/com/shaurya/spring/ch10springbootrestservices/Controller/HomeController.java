package com.shaurya.spring.ch10springbootrestservices.Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
public class HomeController {
    @GetMapping("/home")
    @ResponseBody
    public String home() {
        return "home";
    }
    @GetMapping("/index")
    @ResponseBody
    public String index() {
        return "index";
    }
}
