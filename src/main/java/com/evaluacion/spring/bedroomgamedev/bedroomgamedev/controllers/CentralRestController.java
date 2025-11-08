package com.evaluacion.spring.bedroomgamedev.bedroomgamedev.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CentralRestController {

    @GetMapping("/")
    public String landing(Model landingModel) {
        landingModel.addAttribute("titulo","BedroomGamedev");
        return "landing";
    }
    
    @GetMapping("/login")
    public String login(Model loginModel) {
        loginModel.addAttribute("titulo","Login");
        loginModel.addAttribute("mensaje","Para continuar, deberás iniciar sesión, si no tienes una, puedes crear una cuenta");
        return "login";
    }
    
    @GetMapping("/home")
    public String home(Model homeModel) {
        homeModel.addAttribute("titulo","Home");
        homeModel.addAttribute("mensaje","Bienvenido, esta es tu página principal");
        return "home";
    }
    
    @GetMapping("/settings")
    public String settings(Model settingsModel) {
        settingsModel.addAttribute("titulo","Settings");
        settingsModel.addAttribute("mensaje","Hola!, aquì podrás encontrar los ajustes de tu cuenta y del portal");
        return "settings";
    }
    

}
