package com.example.javafresher.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "feed")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FeedEntity extends EntityBase  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "feed_title", nullable = false, length = 255)
    private String title;

    @Column(columnDefinition = "varchar(255) comment 'description'")
    private String description;


    @ManyToOne(optional = false)
    @ToString.Exclude
    @JsonIgnore
    @JoinColumn(name = "user_id", nullable = false) // foreign key to UserEntity.id
    private UserEntity user;
}
