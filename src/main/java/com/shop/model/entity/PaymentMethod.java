package com.shop.model.entity;

import javax.persistence.*;

@Entity
@Table(name ="PAYMENT_METHOD")
public class PaymentMethod {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "TYPE", nullable = false)
    private String type;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    private Cart cart;
}
