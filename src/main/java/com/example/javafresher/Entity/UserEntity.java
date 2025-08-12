package com.example.javafresher.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user001")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "varchar(255) comment 'user name'", nullable = false)
    private String name;
    @Column(columnDefinition = "varchar(255) comment 'email'", nullable = false, unique = true)
    private String email;
    @Column(columnDefinition = "varchar(6) comment 'password'", nullable = false)
    private String password;
    @Column(columnDefinition = "varchar(255) comment 'address'", nullable = false)
    private String address;


    // getter

    // setter

}
