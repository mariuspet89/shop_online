package com.shop.model;

import javax.persistence.*;

@Entity
@Table(name = "PROVIDER_ADDRESS")
public class ProviderAddress {

    @Id
    @Column(name = "ID",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "STREET", nullable = false)
    private String street;

    @Column(name = "NUMBER", nullable = false)
    private int number;

    @Column(name = "POST_CODE", nullable = false)
    private String postCode;

    @Column(name = "TOWN", nullable = false)
    private String town;

    @Column(name = "COUNTRY", nullable = false)
    private String country;

    @OneToOne
    @JoinColumn(name = "provider_contact_id")
    private ProviderContact providerContact;

}
