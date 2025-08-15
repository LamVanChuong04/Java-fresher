package com.example.javafresher.services;

import com.example.javafresher.Entity.Test;
import org.springframework.data.domain.Page;

import org.springframework.stereotype.Service;

@Service
public interface TestService {
    public Page<Test> search(int pageNo, int pageSize, boolean active);
}
