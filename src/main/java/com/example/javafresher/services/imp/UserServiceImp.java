package com.example.javafresher.services.imp;

import com.example.javafresher.Entity.UserEntity;
import com.example.javafresher.repositories.iml.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public UserEntity createUser(UserEntity user) {
        return userRepository.createUser(user);
    }
}
