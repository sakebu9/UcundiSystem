package com.proyecto.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hello {

    @GetMapping("/index")
    public String helloWorld(Model model) {
        model.addAttribute("title", "Pets Shop");
        model.addAttribute("juguetes", "Juguetes");
        model.addAttribute("ropa", "Ropa");
        model.addAttribute("comida", "Comida");
        model.addAttribute("camas", "Camas");
        model.addAttribute("aseo", "Aseo");
        model.addAttribute("inicio","<div class=\"row\"><div class=\"col-lg-6\"><div class=\"left-content\"><div class=\"thumb\"><div class=\"inner-content\"><h4 th:text=\"${title}\">We Are Hexashop</h4><span>Awesome, clean &amp; creative HTML5 Template</span><div class=\"main-border-button\"><a href=\"#\">Purchase Now!</a></div></div><img src=\"assets/images/Inicio.jpg\" alt=\"\"></div></div></div><div class=\"col-lg-6\"><div class=\"right-content\"><div class=\"row\"><div class=\"col-lg-6\"><div class=\"right-first-image\"><div class=\"thumb\"><div class=\"inner-content\"><h4 th:text=\"${comida}\">Women</h4><span>La mejor comida para tu mascota</span></div><div class=\"hover-content\"><div class=\"inner\"><h4 th:text=\"${comida}\">Women</h4><p>Lorem i</p><div class=\"main-border-button\"><a href=\"/comida\">Ver Mas</a></div></div></div><img src=\"assets/images/comida.jpg\"></div></div></div><div class=\"col-lg-6\"><div class=\"right-first-image\"><div class=\"thumb\"><div class=\"inner-content\"><h4 th:text=\"${juguetes}\">Men</h4><span>Best Clothes For Men</span></div><div class=\"hover-content\"><div class=\"inner\"><h4 th:text=\"${juguetes}\">Men</h4><p>Lorem ipsum dolor sit amet, conservisii ctetur adipiscing elit incid.</p><div class=\"main-border-button\"><a href=\"/juguetes\">Ver Mas</a></div></div></div><img src=\"assets/images/juguetes.jpg\"></div></div></div><div class=\"col-lg-6\"><div class=\"right-first-image\"><div class=\"thumb\"><div class=\"inner-content\"><h4 th:text=\"${camas}\">Kids</h4><span>Best Clothes For Kids</span></div><div class=\"hover-content\"><div class=\"inner\"><h4 th:text=\"${camas}\">Kids</h4><p>Lorem ipsum dolor sit amet, conservisii ctetur adipiscing elit incid.</p><div class=\"main-border-button\"><a href=\"/camas\">Ver Mas</a></div></div></div><img src=\"assets/images/camas.jpg\"></div></div></div><div class=\"col-lg-6\"><div class=\"right-first-image\"><div class=\"thumb\"><div class=\"inner-content\"><h4>Otros</h4><span>Best Trend Accessories</span></div><div class=\"hover-content\"><div class=\"inner\"><h4>Otros</h4><p>Lorem ipsum dolor sit amet, conservisii ctetur adipiscing elit incid.</p><div class=\"main-border-button\"><a href=\"/ropa\">Ver Mas</a></div></div></div><img src=\"assets/images/Otros.jpg\"></div></div></div></div></div></div></div></div>\r\n" + //
                "");
        return "index";
    }
}
