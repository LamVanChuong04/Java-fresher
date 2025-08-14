package com.example.javafresher.repositories.iml;

import com.example.javafresher.Entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    public UserEntity findByNameAndEmail(String name, String email);
    // save user
    @Query(value = "select * from user u where u.name = ?1", countQuery = "select count(*) from user u where u.name = ?1", nativeQuery = true)
    public Page<UserEntity> findAllByNameContaining(String name, Pageable  pageable);

    public UserEntity findByName(String name);
}
