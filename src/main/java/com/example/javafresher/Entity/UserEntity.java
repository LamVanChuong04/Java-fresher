package com.example.javafresher.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class UserEntity extends EntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "varchar(255) comment 'user name'", nullable = false, unique = true)
    private String name;
    @Column(columnDefinition = "varchar(255) comment 'email'", nullable = false)
    private String email;
    @Column(nullable = false, columnDefinition = "varchar(20) comment 'password'")
    private String password;

    @Column(columnDefinition = "varchar(255) comment 'address'", nullable = false)
    private String address;


    // getter

    // setter

}
