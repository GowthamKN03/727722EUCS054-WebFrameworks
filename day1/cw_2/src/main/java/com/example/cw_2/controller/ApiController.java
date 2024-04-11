package com.example.cw_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

   

@RestController
public class ApiController {
    @GetMapping("/studentName")
    public String display(@RequestParam(name="studentName") String studentName)
    {
        return "Welcome " + studentName + "!";
    }
}


