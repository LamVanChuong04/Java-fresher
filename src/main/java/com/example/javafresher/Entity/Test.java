package com.example.javafresher.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date create_date;
    private String username;
    // getter

    // setter
}
