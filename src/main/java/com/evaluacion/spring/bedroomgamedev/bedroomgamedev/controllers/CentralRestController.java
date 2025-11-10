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
        homeModel.addAttribute("mensaje","Aquí podrás encontrar los ultimos elementos cargados por la comunidad");
        homeModel.addAttribute("elemento1","Tutorial");
        homeModel.addAttribute("elemento2","Proyecto");
        homeModel.addAttribute("elemento3","Assets");
        homeModel.addAttribute("elemento4","evento");
        homeModel.addAttribute("elemento5","Tutorial");
        homeModel.addAttribute("nombreElemento1","PBR en Blender");
        homeModel.addAttribute("nombreElemento2","Untitled Sidescroller");
        homeModel.addAttribute("nombreElemento3","Pack de árboles Unity");
        homeModel.addAttribute("nombreElemento4","Game Jam Quilicura");
        homeModel.addAttribute("nombreElemento5","Uso de compresores multi banda");
        return "home";
    }
    
    @GetMapping("/settings")
    public String settings(Model settingsModel) {
        settingsModel.addAttribute("titulo","Settings");
        settingsModel.addAttribute("mensaje","Hola!, aquì podrás encontrar los ajustes de tu cuenta y del portal");
        return "settings";
    }

    @GetMapping("/register")
    public String register(Model registerModel) {
        registerModel.addAttribute("titulo","register");
        registerModel.addAttribute("mensaje","Hola!, aquí podrás registrar tu cuenta");
        return "register";
    }

    @GetMapping("/recover")
    public String recover(Model recoverModel) {
        recoverModel.addAttribute("titulo","recover");
        recoverModel.addAttribute("mensaje","Algo salió mal?, Olvidaste tu contraseña?, Puedes ingresar tu correo para que te ayudemos a recuperar tu cuenta <3");
        return "recover";
    }
    
    @GetMapping("/nosotros")
    public String nosotros(Model nosotrosModel) {
        nosotrosModel.addAttribute("titulo","nosotros");
        nosotrosModel.addAttribute("dev1","Camila Rojas");
        nosotrosModel.addAttribute("dev2","Felipe Mendoza");
        nosotrosModel.addAttribute("dev3","Daniela Espinoza");
        nosotrosModel.addAttribute("dev4","Carlos “Charly” Silva");
        nosotrosModel.addAttribute("dev5","María José “Majo” Pizarro");
        nosotrosModel.addAttribute("dev6","Joaquín “Quino” Fuentes");
        nosotrosModel.addAttribute("devPuesto1","Diseñadora de narrativa y diálogo");
        nosotrosModel.addAttribute("devPuesto2","Programador de gameplay (Unity / C#)");
        nosotrosModel.addAttribute("devPuesto3","Artista 2D / Ilustradora de personajes");
        nosotrosModel.addAttribute("devPuesto4","Sound designer y compositor indie");
        nosotrosModel.addAttribute("devPuesto5","Productora y community manager");
        nosotrosModel.addAttribute("devPuesto6","QA tester y diseñador de niveles");
        return "nosotros";
    }

    @GetMapping("/tutoriales")
    // de momento todas los links terminan aquí(con datos dummy)
    public String tutoriales(Model tutorialesModel) {
        tutorialesModel.addAttribute("titulo","Tutoriales (Dummy)");
        tutorialesModel.addAttribute("mensaje","Aquí podrás encontrar los futuros elementos de la página, por el momento todos los links llegan aquí, sin embargo esto va a ir poblandose con el tiempo <");
        tutorialesModel.addAttribute("elemento","Titulo del elemento");
        tutorialesModel.addAttribute("elementoTipo","Tipo de elemento");
        tutorialesModel.addAttribute("elementoDescripcion","On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue; and equal blame");
        return "tutoriales";
    }

    @GetMapping("/añadir")
    // de momento todas los links terminan aquí(con datos dummy)
    public String añadir(Model añadirModel) {
        añadirModel.addAttribute("titulo","Añadir (Dummy)");
        añadirModel.addAttribute("mensaje","Aquí podrás añadir futuros elementos y compartirlos con la comunidad");
        return "añadir";
    }

}
