package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/")
        String hello() {
        return "Deployed";
    }

}