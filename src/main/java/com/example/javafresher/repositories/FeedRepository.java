package com.example.javafresher.repositories;

import com.example.javafresher.Entity.FeedEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedRepository extends JpaRepository<FeedEntity, Long> {
}
