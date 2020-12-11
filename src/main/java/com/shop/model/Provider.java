package com.shop.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PROVIDER")
public class Provider {
    @Id
    @Column(name = "ID",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "CONTACT", nullable = false)
    private String contact;

    @OneToOne(mappedBy = "provider", cascade = CascadeType.ALL)
    private ProviderContact providerContact;

    @OneToMany(mappedBy = "provider", cascade = CascadeType.ALL)
    private List<Product> productList;

}
