package com.example.javafresher.services;


import com.example.javafresher.Entity.UserEntity;
import org.springframework.data.domain.Page;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    public List<UserEntity> getAllUsers();
    public UserEntity createUser(UserEntity user);
    // search theo tên
    public UserEntity findByNameAndEmail(String name, String email);
    // page search
    //public Page<UserEntity> searchByName(int pageNo, int pageSize, String name);
    // page search sortby
    public Page<UserEntity> searchSort(int pageNo, int pageSize);

    public UserEntity findUser(String name);
}
