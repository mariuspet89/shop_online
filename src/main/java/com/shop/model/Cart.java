package com.shop.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CART")
public class Cart {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "TOTAL_VALUE_OF_THE_PRODUCTS", nullable = false)
    private double totalValueOfTheProducts;
    @Column(name = "QUANTITY_OF_PRODUCTS", nullable = false)
    private double quantityOfProducts;


    private List<Product> productList;

    @OneToOne
    @JoinColumn(name = "PAYMENT_METHOD_ID", referencedColumnName = "id")
    private PaymentMethod paymentMethod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalValueOfTheProducts() {
        return totalValueOfTheProducts;
    }

    public void setTotalValueOfTheProducts(double totalValueOfTheProducts) {
        this.totalValueOfTheProducts = totalValueOfTheProducts;
    }

    public double getQuantityOfProducts() {
        return quantityOfProducts;
    }

    public void setQuantityOfProducts(double quantityOfProducts) {
        this.quantityOfProducts = quantityOfProducts;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}