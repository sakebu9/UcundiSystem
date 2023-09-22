package com.proyecto.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class aseocontroller {
    @GetMapping("/createaseo")
    public String createAseo() {
        return "Aseo añadida";
    }

    @GetMapping("/readaseo")
    public String readAseo() {
        return "Aseo consultada";
    }

    @GetMapping("/updateaseo")
    public String updateAseo() {
        return "Aseo actualizada";
    }

    @GetMapping("/deleteaseo")
    public String deleteAseo() {
        return "Aseo eliminada";
    }
}
