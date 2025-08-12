package com.example.javafresher.repositories.iml;

import com.example.javafresher.Entity.UserEntity;
import org.apache.catalina.User;

import java.util.List;

public interface UserRepository {
    // tạo user
    public UserEntity createUser(UserEntity user);
    // get all user
    public List<UserEntity> getAllUsers();
}
