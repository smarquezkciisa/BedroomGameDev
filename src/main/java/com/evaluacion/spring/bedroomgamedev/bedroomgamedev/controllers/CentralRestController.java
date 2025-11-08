package com.evaluacion.spring.bedroomgamedev.bedroomgamedev.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CentralRestController {

    @GetMapping("/")
    public String landing(Model landingModel) {
        landingModel.addAttribute("titulo","BedroomGamedev");
        landingModel.addAttribute("carousellTitulo1","Diseño de Sonido");
        landingModel.addAttribute("carousellTitulo2","Programación");
        landingModel.addAttribute("carousellTitulo3","World Design");
        landingModel.addAttribute("carousellTexto1","Producción y diseño de sonido, compresión, ecualización, gain staging");
        landingModel.addAttribute("carousellTexto2","Recursos educativos para el aprendizaje de diferentes lenguajes de programación");
        landingModel.addAttribute("carousellTexto3","Explora los mundos en juegos existentes y estudia el arte y las influencias que dan forma a sus temas y estilos.");
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
