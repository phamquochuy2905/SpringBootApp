package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

    //@GetMapping("/")
        //public String welcome(@RequestParam(value = "name", defaultValue = "world")String name) {
        //return String.format("Hello, %s", name);
    }

