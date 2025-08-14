package com.example.javafresher;

import com.example.javafresher.Entity.FeedEntity;
import com.example.javafresher.Entity.UserEntity;
import com.example.javafresher.repositories.iml.FeedRepository;
import com.example.javafresher.repositories.iml.UserRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@SpringBootTest

public class UserTest {
    @Autowired
    private FeedRepository feedRepository;
    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    @Rollback(false)
    void OneToManyTest(){
        //1. tạo user
        UserEntity user = new UserEntity();
        user.setEmail("hello@gmai.com");
        user.setPassword("123456");
        user.setName("LaViAi");
        user.setAddress("Hoài Phú");
        //2. tạo feed
        FeedEntity feed = new FeedEntity();
        feed.setDescription("hello, my friend");
        feed.setTitle("my friend");
        user.setFeeds(List.of(feed));
        feed.setUser(user);
        userRepository.save(user);
        feedRepository.save(feed);

    }
    @Test
    @Transactional
    @Rollback(false)
    void OneToManyTest2(){
        //1. tạo user
        UserEntity user = new UserEntity();
        user.setEmail("ngancl@gmai.com");
        user.setPassword("123456");
        user.setName("Lâm Phương Tú");
        user.setAddress("Ha Noi");
        //2. tạo feed
        FeedEntity feed = new FeedEntity();
        feed.setDescription("NYC sếp");
        feed.setTitle("funny");
        user.setFeeds(List.of(feed));
        feed.setUser(user);
        userRepository.save(user);
//        feedRepository.save(feed);

    }
}
