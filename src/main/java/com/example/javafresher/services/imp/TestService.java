package com.example.javafresher.services.imp;

import com.example.javafresher.Entity.Test;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface TestService {
    public Page<Test> search(int pageNo, int pageSize);
}
