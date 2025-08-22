package com.example.javafresher.Entity;

import jakarta.persistence.*;
import lombok.*;


import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
@ToString
public class UserEntity extends EntityBase  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // user_id
    @Column(columnDefinition = "varchar(255) comment 'user name'", nullable = false, unique = true)
    private String name;
    @Column(columnDefinition = "varchar(255) comment 'email'", nullable = false)
    private String email;
    @Column(nullable = false, columnDefinition = "varchar(20) comment 'password'")
    private String password;

    @Column(columnDefinition = "varchar(255) comment 'address'", nullable = false)
    private String address;

    // 1 user->n feeds
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<FeedEntity> feeds;
    // getter

    // setter
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "cccds_id")
    private CCCDEntity cccd;
}
