package com.shop.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Delivery {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "TYPE", nullable = false)
    private Enum type;
    @Column(name = "FEE", nullable = false)
    private double fee;
    @Column(name = "ARRIVAL_TIME", nullable = false)
    private Date arrivalTime;
}
