package com.proyecto.demo.service.impl;

import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.proyecto.demo.Repositories.userRepositories;
import com.proyecto.demo.dominian.userEntity;
import com.proyecto.demo.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private userRepositories UserDao;

    @Override
    public ResponseEntity<String> SignUp(Map<String, String> requestMap) {
        return null;
    }

    private @NotNull userEntity getUserFromMap(Map<String, String> requestMap) {
        userEntity User = new userEntity();
        User.setName(requestMap.get("nombre"));
        User.setEmail(requestMap.get("email"));
        User.setPassword(requestMap.get("password"));
        User.setStatus(requestMap.get("status"));
        User.setRole(requestMap.get("role"));

        return User;
    }
}
