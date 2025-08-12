package com.example.javafresher.controllers;


import com.example.javafresher.Entity.UserEntity;
import com.example.javafresher.services.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CrudUserControllers {
    @Autowired
    private UserServiceImp userServiceImp;
    @GetMapping("/home")
    public String getHomePage(){
        return "Page-home";
    }
    @PostMapping("/add")
    public UserEntity addUser(UserEntity user){
        return userServiceImp.createUser(user);
    }
    @GetMapping("/getAll")
    public List<UserEntity> getAllUsers(){
        return userServiceImp.getAllUsers();
    }

}
