package com.shop.model;

import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PROVIDER_ADDRESS")
@Proxy(lazy = false)
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
    @JoinColumn(name = "PROVIDER_CONTACT_ID")
    private ProviderContact providerContact;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ProviderContact getProviderContact() {
        return providerContact;
    }

    public void setProviderContact(ProviderContact providerContact) {
        this.providerContact = providerContact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProviderAddress)) return false;
        ProviderAddress that = (ProviderAddress) o;
        return getNumber() == that.getNumber() && Objects.equals(getId(), that.getId()) && Objects.equals(getStreet(), that.getStreet()) && Objects.equals(getPostCode(), that.getPostCode()) && Objects.equals(getTown(), that.getTown()) && Objects.equals(getCountry(), that.getCountry()) && Objects.equals(getProviderContact(), that.getProviderContact());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getStreet(), getNumber(), getPostCode(), getTown(), getCountry(), getProviderContact());
    }
}
