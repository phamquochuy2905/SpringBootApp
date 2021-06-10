package com.example.springboot;

import com.example.springboot.config.Endpoints;
import com.example.springboot.config.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {


    @RequestMapping("/")
    public String index() {
        return "Welcome to Food Map!";
    }

    @GetMapping("/hello")
    public String welcome(@RequestParam(value = "name", defaultValue = "world") String name) {
        return String.format("Hello, %s", name);
    }

}
