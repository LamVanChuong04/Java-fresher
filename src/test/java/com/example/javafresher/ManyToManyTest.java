package com.example.javafresher;

import com.example.javafresher.Entity.OrderEntity;
import com.example.javafresher.Entity.ProductEntity;
import com.example.javafresher.repositories.OrderRepository;
import com.example.javafresher.repositories.ProductRepository;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
public class ManyToManyTest {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Test
    @Transactional
    @Rollback(false)
    public void manyToManyTest() {
        ProductEntity p1 = new ProductEntity();
        ProductEntity p2 = new ProductEntity();

        OrderEntity o1 = new OrderEntity();
        OrderEntity o2 = new OrderEntity();
        OrderEntity o3 = new OrderEntity();

        p1.setName("Mì tôm hảo hảo");
        p2.setName("Sting dâu");
        p2.setPrice(new BigDecimal("8"));
        p1.setPrice(new BigDecimal("5.2"));

        p1.setOrders(List.of(o3, o2));
        p2.setOrders(List.of(o2));


        o1.setUserId(3L);
        o2.setUserId(5L);
        o3.setUserId(2L);

        // save
        productRepository.save(p1);
        productRepository.save(p2);

        orderRepository.save(o1);
        orderRepository.save(o2);
        orderRepository.save(o3);

    }

    @Test
    @Transactional
    @Rollback(false)
    public void findProductOrder() {
        ProductEntity p = productRepository.findById(3L).orElseThrow();
        System.out.println(p);
        System.out.println(p.getOrders());
    }
}
