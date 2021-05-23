package com.example.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer, WebMvcConfigImpl {

    @Override
    public void ViewControllers(ViewControllerRegistry registry) {
        registry.addViewController(Endpoints.INDEX).setViewName(ViewNames.INDEX);
        registry.addViewController(Endpoints.FOOD).setViewName(ViewNames.FOOD);
        registry.addViewController(Endpoints.LOGIN).setViewName(ViewNames.LOGIN);
    }
}
