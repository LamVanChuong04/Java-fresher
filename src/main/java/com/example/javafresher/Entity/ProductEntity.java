package com.example.javafresher.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ProductEntity extends EntityBase{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "product_name",unique = true, nullable = false)
    private String name;

    @Column(name = "product_price", nullable = false)
    private BigDecimal price;

    // MANY TO MANY
    // fetch.eager: hibernate tự động loading ngay khi khởi tạo entity
    // fetch.lazy: chỉ loading khi truy cập vào nó ví dụ như getter
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "product_order", joinColumns = @JoinColumn(name = "product_Id"),// joincolumns: bên chủ sở hữu mối quan he
            inverseJoinColumns = @JoinColumn(name = "order_Id")// bên còn lại
    )
    private List<OrderEntity> orders;
}
