package com.proyecto.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class juguetescontroller {
    @GetMapping("/createjuguetes")
    public String createJuguetes() {
        return "Juguetes añadida";
    }

    @GetMapping("/readjuguetes")
    public String readJuegetes() {
        return "Jugetes consultada";
    }

    @GetMapping("/updatejugetes")
    public String updateJugetes() {
        return "Jugetes actualizada";
    }

    @GetMapping("/deletejugetes")
    public String deleteJugetes() {
        return "Juguetes eliminada";
    }
}
