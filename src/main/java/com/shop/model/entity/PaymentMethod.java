package com.shop.model.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PAYMENT_METHOD")
public class PaymentMethod {

    @Id
    @Column(name = "ID", nullable = false)
    private int id;
    @Column(name = "TYPE", nullable = false)
    private String type;
    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    private Cart cart;
    private Delivery delivery;

}
