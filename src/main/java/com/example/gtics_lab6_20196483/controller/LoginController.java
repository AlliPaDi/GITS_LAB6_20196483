package com.example.gtics_lab6_20196483.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginWindow(){
        return "login";
    }
}
