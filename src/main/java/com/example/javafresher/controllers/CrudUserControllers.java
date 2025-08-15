package com.example.javafresher.controllers;


import com.example.javafresher.Entity.Test;
import com.example.javafresher.Entity.UserEntity;

import com.example.javafresher.dto.DataMailDTO;
import com.example.javafresher.services.imp.MailServiceImpl;
import com.example.javafresher.services.imp.TestServiceImpl;
import com.example.javafresher.services.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CrudUserControllers {
    @Autowired
    private UserServiceImp userServiceImp;

    @Autowired
    private TestServiceImpl testServiceImpl;

    @Autowired
    private MailServiceImpl mailServiceImpl;
    @GetMapping("/home")
    public String getHomePage(){
        return "Page-home";
    }
    @PostMapping("/add")
    public UserEntity addUser(@RequestBody UserEntity user){
        return userServiceImp.createUser(user);
    }
    @GetMapping("/getAll")
    public List<UserEntity> getAllUsers(){
        return userServiceImp.getAllUsers();
    }
    @GetMapping("search")
    public UserEntity searchUser(@RequestParam("name") String name, @RequestParam("email") String email){
        return userServiceImp.findByNameAndEmail(name, email);
    }

    @GetMapping("/searchPage")
    public ResponseEntity<?> search(@RequestParam(name = "pageNo") int pageNo ,@RequestParam(name = "pageSize") int pageSize, @RequestParam(name = "isActive") boolean active ){
        Page<Test> test = testServiceImpl.search(pageNo, pageSize, active);
        return ResponseEntity.ok(test);
    }

    @GetMapping("/searchName")
    public ResponseEntity<?> search2(@RequestParam(name = "pageNo") int pageNo ,@RequestParam(name = "pageSize") int pageSize, @RequestParam(name = "name") String name ){
        Page<UserEntity> user = userServiceImp.searchByName(pageNo, pageSize, name);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/searchSort")
    public ResponseEntity<?> search3(@RequestParam(name = "pageNo") int pageNo ,@RequestParam(name = "pageSize") int pageSize){
        Page<UserEntity> user = userServiceImp.searchSort(pageNo, pageSize);
        return ResponseEntity.ok(user);
    }

    @PostMapping("send-text")
    public ResponseEntity<?> sendTextMail(@RequestBody DataMailDTO mailDTO){
        String to = mailDTO.getTo();
        String subject = mailDTO.getSubject();
        String content = mailDTO.getContent();
        mailServiceImpl.sendTextMail(to, subject, content);
        return ResponseEntity.ok("Send Mail");
    }
}
