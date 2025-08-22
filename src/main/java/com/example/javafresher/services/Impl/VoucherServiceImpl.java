package com.example.javafresher.services.Impl;

import com.example.javafresher.Entity.VoucherEntity;
import com.example.javafresher.repositories.VoucherRepository;
import com.example.javafresher.services.VoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VoucherServiceImpl implements VoucherService {
    @Autowired
    private VoucherRepository voucherRepository;

    @Cacheable("voucher")
    @Override
    public List<VoucherEntity> getAllVouchers() {
        System.out.println("Query database new ...");
        return voucherRepository.findAll();
    }
    @CacheEvict(allEntries = true, value = "voucher")
    @Override
    public void saveVoucher(VoucherEntity voucher) {
        voucherRepository.save(voucher);
    }
}
