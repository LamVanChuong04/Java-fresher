package com.example.javafresher.services.imp;

import com.example.javafresher.Entity.Test;
import com.example.javafresher.repositories.iml.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestRepository testRepository;

    @Override
    public Page<Test> search(int pageNo, int pageSize, boolean active) {
        Pageable pageable = PageRequest.of(pageNo-1, pageSize);
        return testRepository.search2(active ,pageable);
    }
}
