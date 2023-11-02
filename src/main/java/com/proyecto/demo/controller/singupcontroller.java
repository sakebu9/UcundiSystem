package com.proyecto.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyecto.demo.Repositories.userRepositories;

@RestController
@RequestMapping("/sing")
public class singupcontroller {
    @Autowired
    private userRepositories UserDao;


    public String singupcontroller(){
      return("works");
    }
}
