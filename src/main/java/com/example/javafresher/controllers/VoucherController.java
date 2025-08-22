package com.example.javafresher.controllers;

import com.example.javafresher.Entity.VoucherEntity;
import com.example.javafresher.services.Impl.VoucherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/voucher")
public class VoucherController {
    @Autowired
    private VoucherServiceImpl voucherServiceImpl;
    @GetMapping("/get-all")
    public List<VoucherEntity> getVouchers() {
        return voucherServiceImpl.getAllVouchers();
    }

    // them voucher

    @PostMapping("/add")
    public ResponseEntity<?> addVoucher(@RequestBody VoucherEntity voucher) {
        VoucherEntity voucherEntity = new VoucherEntity();
        voucherEntity.setVoucherName(voucher.getVoucherName());
        voucherEntity.setVoucherDescription(voucher.getVoucherDescription());
        voucherEntity.setVoucherPrice(voucher.getVoucherPrice());
        voucherServiceImpl.saveVoucher(voucherEntity);
        return ResponseEntity.ok("success");
    }
}
