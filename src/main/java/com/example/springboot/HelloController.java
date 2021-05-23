package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/hello")
    public String welcome(@RequestParam(value = "name", defaultValue = "world") String name) {
        return String.format("Hello, %s", name);
    }
}
