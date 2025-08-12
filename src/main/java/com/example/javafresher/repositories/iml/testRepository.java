package com.example.javafresher.repositories.iml;

import com.example.javafresher.Entity.Test;
import com.example.javafresher.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface testRepository extends JpaRepository<Test,Integer> {

}
