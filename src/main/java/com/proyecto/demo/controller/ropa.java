package com.proyecto.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ropa {

  @GetMapping("/ropa")
  public String helloWorld(Model model) {

    model.addAttribute("title", "Pets Shop");
    model.addAttribute("juguetes", "Juguetes");
    model.addAttribute("ropa", "Ropa");
    model.addAttribute("comida", "Comida");
    model.addAttribute("camas", "Camas");
    model.addAttribute("aseo", "Aseo");
    return "index";
  }
}