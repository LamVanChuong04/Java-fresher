package com.example.javafresher.repositories;

import com.example.javafresher.Entity.Test;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<Test,Integer> {
    @Query(value = "select * from test", countQuery = "select count(*) from test",nativeQuery = true)
    public Page<Test> searchCustomize(Pageable pageable);

    // search theo nhieu tieu chi
    @Query(value = "select * from test t where t.is_active = ?1", countQuery = "select count(*) from test t where t.is_active = ?1",nativeQuery = true)
    public Page<Test> search2(Boolean active, Pageable pageable);
}
