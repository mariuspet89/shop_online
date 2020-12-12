package com.shop.model;

/*@Entity
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Delivery)) return false;
        Delivery delivery = (Delivery) o;
        return Double.compare(delivery.getFee(), getFee()) == 0 && Objects.equals(getId(), delivery.getId()) && Objects.equals(getType(), delivery.getType()) && Objects.equals(getArrivalTime(), delivery.getArrivalTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getType(), getFee(), getArrivalTime());
    }
}*/
