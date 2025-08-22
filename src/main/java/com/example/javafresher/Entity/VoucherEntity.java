package com.example.javafresher.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vouchers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VoucherEntity extends EntityBase  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String voucherName;
    @Column(name = "Sales", nullable = false)
    private double voucherPrice;
    @Column(name = "Description", nullable = false)
    private String voucherDescription;

}
