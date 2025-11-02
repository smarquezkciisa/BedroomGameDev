package com.evaluacion.spring.bedroomgamedev.bedroomgamedev.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CentralController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/")
    public String landing(){
        return "landing";
    }
    
    @GetMapping("/login")
    public String login(){
        return "login";
    }


}
