package com.example.SpringBootJenking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/name")
    public String getName(){
        return "Vikas/Sgubham";
    }
}
