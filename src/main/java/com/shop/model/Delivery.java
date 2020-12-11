package com.shop.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "DELIVERY")
public class Delivery {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "DELIVERY_TYPE", nullable = false)
    private String type;
    @Column(name = "FEE", nullable = false)
    private double fee;
    @Column(name = "ARRIVAL_TIME", nullable = false)
    private Date arrivalTime;


}
