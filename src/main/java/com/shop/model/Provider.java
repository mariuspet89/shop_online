package com.shop.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public ProviderContact getProviderContact() {
        return providerContact;
    }

    public void setProviderContact(ProviderContact providerContact) {
        this.providerContact = providerContact;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Provider)) return false;
        Provider provider = (Provider) o;
        return Objects.equals(getId(), provider.getId()) && Objects.equals(getName(), provider.getName()) && Objects.equals(getContact(), provider.getContact()) && Objects.equals(getProviderContact(), provider.getProviderContact()) && Objects.equals(getProductList(), provider.getProductList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getContact(), getProviderContact(), getProductList());
    }
}
