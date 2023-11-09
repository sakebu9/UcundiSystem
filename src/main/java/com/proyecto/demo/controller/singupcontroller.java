package com.proyecto.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyecto.demo.Repositories.userRepositories;
import com.proyecto.demo.constans.loginCodes;
import com.proyecto.demo.constans.loginUtils;
import com.proyecto.demo.service.UserService;

import java.util.Map;

@RestController
@RequestMapping("/sing")
public class singupcontroller {
    @Autowired
    private UserService userService;


    
      
    @PostMapping("/signup")
    public ResponseEntity<String> registroUsuario(@RequestBody(required = true)Map<String,String> requestMap){
        try{
            userService.SignUp(requestMap);
            return loginUtils.getResponseEntity(loginCodes.SUCCESS, HttpStatus.CREATED);
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return loginUtils.getResponseEntity(loginCodes.SOMETHING_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    }

