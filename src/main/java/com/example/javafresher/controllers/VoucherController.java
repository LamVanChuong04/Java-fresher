package com.example.javafresher.controllers;

import com.example.javafresher.Entity.VoucherEntity;
import com.example.javafresher.services.Impl.VoucherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
