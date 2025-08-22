package com.example.javafresher.services;

import com.example.javafresher.Entity.VoucherEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VoucherService {
    List<VoucherEntity> getAllVouchers();

    void saveVoucher(VoucherEntity voucher);
}
