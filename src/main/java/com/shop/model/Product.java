package com.shop.model;

import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PRODUCT")
@Proxy(lazy = false)
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


/*    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;*/

    @ManyToOne
    @JoinColumn(name = "provider_id")
    private Provider provider;

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

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.getPrice(), getPrice()) == 0 && getQuantity() == product.getQuantity() && Objects.equals(getId(), product.getId()) && Objects.equals(getName(), product.getName()) && Objects.equals(getMake(), product.getMake()) && Objects.equals(getDescription(), product.getDescription()) && Objects.equals(getImage(), product.getImage()) && Objects.equals(getProvider(), product.getProvider());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getMake(), getPrice(), getQuantity(), getDescription(), getImage(), getProvider());
    }
}
