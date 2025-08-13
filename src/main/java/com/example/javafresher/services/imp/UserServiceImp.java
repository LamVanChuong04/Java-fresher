package com.example.javafresher.services.imp;

import com.example.javafresher.Entity.UserEntity;
import com.example.javafresher.Entity.Test;
import com.example.javafresher.repositories.iml.UserRepository;
import com.example.javafresher.repositories.iml.testRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private testRepository testRepository;
    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    //@Transactional
    public UserEntity createUser(UserEntity user) {
        Test t = new Test();
        t.setUsername("Lâm Văn Chương");
        testRepository.save(t);
        return userRepository.save(user);
    }

    @Override
    public UserEntity findByNameAndEmail(String name, String email) {
        return userRepository.findByNameAndEmail(name, email);
    }
}
