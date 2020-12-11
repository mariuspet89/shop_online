package com.shop.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CART")
public class Cart {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    private List<Product> productList;

    @OneToOne(mappedBy = "cart")
    private PaymentMethod paymentMethod;
}
