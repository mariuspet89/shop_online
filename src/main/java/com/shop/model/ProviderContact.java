package com.shop.model;

import javax.persistence.*;

@Entity
@Table(name = "PROVIDER_CONTACT")
public class ProviderContact {

    @Id
    @Column(name = "ID",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "TELEFON_NUMBER", nullable = false)
    private int telefonNumber;

    @Column(name = "EMIAL_ADDRESS", nullable = false)
    private String emailAddress;

    @Column(name = "FAX", nullable = false)
    private int fax;

    @OneToOne(mappedBy = "providerContact", cascade = CascadeType.ALL)
    private ProviderAddress providerAddress;

    @OneToOne
    @JoinColumn(name = "provider_id")
    private Provider provider;

}
