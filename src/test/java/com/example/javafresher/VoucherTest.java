package com.example.javafresher;

import com.example.javafresher.Entity.VoucherEntity;
import com.example.javafresher.services.Impl.VoucherServiceImpl;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VoucherTest {
    @Autowired
    private VoucherServiceImpl voucherServiceImpl;
    @Test
    //@Transactional
    public void test1(){
        VoucherEntity voucher = new VoucherEntity();
        voucher.setVoucherName("Sales 1-9-25");
        voucher.setVoucherPrice(0.15);
        voucher.setVoucherDescription("Sales sap sang chao mung ngay Quoc Khanh.");
        voucherServiceImpl.saveVoucher(voucher);
        System.out.println(voucher);
    }

}
