package com.shaurya.spring.ch10springbootrestservices.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MainController {
    @GetMapping("/main")
    public String main() {
        return "main";
    }
}
