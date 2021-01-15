package com.example.my_spring_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomePageController {

    @RequestMapping(value = "/home")
    public static String WelcomeHome(){
        return "index";
    }
}
