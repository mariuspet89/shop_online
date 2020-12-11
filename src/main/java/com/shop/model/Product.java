package com.shop.model;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "NAME", nullable = false)
    private String name;
    @Column(name = "MAKE", nullable = false )
    private String make;
    @Column(name = "PRICE", nullable = false)
    private double price;
    @Column(name = "QUANTITY", nullable = false)
    private int quantity;
    @Column(name = "DESCRIPTION", nullable = false)
    private String description;
    @Column(name = "IMAGE", nullable = false)
    private String image;


    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "provider_id")
    private Provider provider;


}
