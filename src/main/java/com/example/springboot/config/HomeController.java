package com.example.springboot.config;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

        @RequestMapping("/")
        public String welcome() {
            return "index";
        }

        @RequestMapping("/home")
        public String home() {
            return "index";
        }


        @RequestMapping("/login")
        public String login() {
            return "login";
        }

        @RequestMapping("/registration")
        public String registration() {
            return "Registration";
    }

    }

