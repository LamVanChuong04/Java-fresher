package com.example.javafresher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class JavaFresherApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaFresherApplication.class, args);
        System.out.println("Hello World");
    }

}
