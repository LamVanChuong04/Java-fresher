package com.example.javafresher.services.imp;


import com.example.javafresher.Entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<UserEntity> getAllUsers();
    public UserEntity createUser(UserEntity user);
}
