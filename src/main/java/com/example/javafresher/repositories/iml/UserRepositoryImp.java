package com.example.javafresher.repositories.iml;

import com.example.javafresher.Entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserRepositoryImp implements UserRepository {

    @Override
    public UserEntity createUser(UserEntity user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1L);
        userEntity.setName("Lâm Văn Chương");
        userEntity.setPassword("123456");
        userEntity.setAddress("Hoài Phú");
        userEntity.setEmail("lamvanchuong04@gmail.com");
        return userEntity;
    }

    @Override
    public List<UserEntity> getAllUsers() {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1L);
        userEntity.setName("Lâm Văn Chương");
        userEntity.setPassword("123456");
        userEntity.setAddress("Hoài Phú");
        userEntity.setEmail("lamvanchuong04@gmail.com");
        return List.of(userEntity);
    }
}
