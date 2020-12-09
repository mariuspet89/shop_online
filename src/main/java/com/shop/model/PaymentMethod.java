package com.shop.model;

import javax.persistence.*;

@Entity
@Table(name ="PAYMENT_METHOD")
public class PaymentMethod {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "TYPE", nullable = false)
    private String type;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public PaymentMethod(int id, String type, String description, Cart cart) {
        this.id = id;
        this.type = type;
        this.description = description;
    }
}
