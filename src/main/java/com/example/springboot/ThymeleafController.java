package com.example.springboot;

import com.example.springboot.config.Endpoints;
import com.example.springboot.config.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThymeleafController {
    @GetMapping(path = Endpoints.INDEX)
    public ModelAndView IndexPage() {
        return new ModelAndView(ViewNames.INDEX);
    }

    @GetMapping(path = Endpoints.FOOD)
    public ModelAndView FoodShowing() {
        return new ModelAndView(ViewNames.FOOD);
    }

    @GetMapping(path = Endpoints.LOGIN)
    public ModelAndView Login() {
        return new ModelAndView(ViewNames.LOGIN);
    }
}
