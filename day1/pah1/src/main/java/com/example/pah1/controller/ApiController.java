package com.example.pah1.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ApiController {
    @GetMapping("/welcome")
    public String welcome() {
        return "Hello World";
    }
    
}
