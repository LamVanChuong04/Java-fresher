package com.example.javafresher.repositories.iml;

import com.example.javafresher.Entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    public UserEntity findByNameAndEmail(String name, String email);
    // save user

}
