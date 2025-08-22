package com.example.javafresher.repositories;

import com.example.javafresher.Entity.VoucherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface VoucherRepository  extends JpaRepository<VoucherEntity,Long> {

}
