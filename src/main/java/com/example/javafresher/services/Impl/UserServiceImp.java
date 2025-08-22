package com.example.javafresher.services.Impl;

import com.example.javafresher.Entity.UserEntity;
import com.example.javafresher.Entity.Test;
import com.example.javafresher.repositories.TestRepository;
import com.example.javafresher.repositories.UserRepository;
import com.example.javafresher.services.UserService;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TestRepository testRepository;
    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public UserEntity createUser(UserEntity user) {
        Test t = new Test();
        t.setUsername("Lâm Văn Chương");
        testRepository.save(t);
        return userRepository.save(user);
    }

    @Override
    public UserEntity findByNameAndEmail(String name, String email) {
        System.out.println("Truy van database");
        return userRepository.findByNameAndEmail(name, email);
    }

//    @Override
//    public Page<UserEntity> searchByName(int pageNo, int pageSize, String name) {
//        Pageable pageable = PageRequest.of(pageNo, pageSize);
//        return userRepository.findAllByNameContaining(name, pageable);
//    }

    @Override
    public Page<UserEntity> searchSort(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo-1, pageSize, Sort.by("name").descending());
        return userRepository.findAll(pageable);
    }

    @Override
    public UserEntity findUser(String name) {
        return userRepository.findByName(name);
    }


}
