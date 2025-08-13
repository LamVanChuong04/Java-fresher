package com.example.javafresher.Entity;

import jakarta.persistence.*;
import lombok.*;



@Entity
@Getter
@Setter
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Test extends EntityBase{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    // getter

    // setter
}
