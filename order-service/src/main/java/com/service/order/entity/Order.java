package com.service.order.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.persistence.*;

@Entity
@Table(name = "orders")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private String product;

    private Integer quantity;

    // Constructors
    public Order() {}

    public Order(Long userId, String product, Integer quantity) {
        this.userId = userId;
        this.product = product;
        this.quantity = quantity;
    }

}

