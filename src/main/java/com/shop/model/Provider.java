package com.shop.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Provider {
    @Id
    @Column(name = "ID",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NAME", nullable = false)
    private String name;
    @Column(name = "ADRESS", nullable = false)
    private String address;
    @Column(name = "CONTACT", nullable = false)
    private String contact;

    private List<Product> productList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Provider(int id, String name, String address, String contact, List<Product> productList) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.productList = productList;
    }
}
