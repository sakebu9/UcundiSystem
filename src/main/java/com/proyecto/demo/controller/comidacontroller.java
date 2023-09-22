package com.proyecto.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class comidacontroller {
    @GetMapping("/createcomida")
    public String createComida() {
        return "Comida añadida";
    }

    @GetMapping("/readcomida")
    public String readComida() {
        return "Comida consultada";
    }

    @GetMapping("/updatecomida")
    public String updateComida() {
        return "Comida actualizada";
    }

    @GetMapping("/deletecomida")
    public String deleteComida() {
        return "Comida eliminada";
    }
}
