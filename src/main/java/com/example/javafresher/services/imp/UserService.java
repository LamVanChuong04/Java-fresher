package com.example.javafresher.services.imp;


import com.example.javafresher.Entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<UserEntity> getAllUsers();
    public UserEntity createUser(UserEntity user);
    // search theo tên
    public UserEntity findByNameAndEmail(String name, String email);
    // page search
    public Page<UserEntity> searchByName(int pageNo, int pageSize, String name);
}
