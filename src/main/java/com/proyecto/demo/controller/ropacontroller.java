package com.proyecto.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ropacontroller {
    @GetMapping("/createropa")
    public String createRopa() {
        return "Ropa añadida";
    }

    @GetMapping("/readropa")
    public String readRopa() {
        return "Ropa consultada";
    }

    @GetMapping("/updateropa")
    public String updateRopa() {
        return "Ropa actualizada";
    }

    @GetMapping("/deleteropa")
    public String deleteRopa() {
        return "Ropa eliminada";
    }
}
