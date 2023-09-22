package com.proyecto.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class camascontroller {
    @GetMapping("/createCamas/{id}")
    public String addCamas(@PathVariable("id") String id) {
        String regexforID = "[1-9 a-z]{1,9}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Cama adicionada satisfactoriamente " + id;
    }

    @GetMapping("/createcamas")
    public String createCamas() {
        return "Cama añadida";
    }

    @GetMapping("/readcamas/{id}")
    public String readCamas(@PathVariable("id") String id) {
        String regexforID = "[1-9 a-z]{1,9}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Cama consultada" + id;
    }

    @GetMapping("/readcamas/")
    public String readCamas() {
        return "Cama consultada";
    }

    @GetMapping("/updatecamas")
    public String updateCamas(@PathVariable("id") String id) {
        String regexforID = "[1-9 a-z]{1,9}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Cama actualizada" + id;
    }

    @GetMapping("/updatecamas")
    public String updateCamas() {
        return "Cama actualizada";
    }

    @GetMapping("/deletecamas")
    public String deleteCamas(@PathVariable("id") String id) {
        String regexforID = "[1-9 a-z]{1,9}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Cama eliminada" + id;
    }

    @GetMapping("/deletecamas")
    public String deleteCamas() {
        return "Cama eliminada";
    }
}
