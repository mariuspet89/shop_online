package com.shop.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PROVIDER_CONTACT")
public class ProviderContact {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "TELEPHON_NUMBER", nullable = false)
    private int telephonNumber;

    @Column(name = "EMIAL_ADDRESS", nullable = false)
    private String emailAddress;

    @Column(name = "FAX", nullable = false)
    private int fax;

    @OneToOne(mappedBy = "providerContact", cascade = CascadeType.ALL)
    private ProviderAddress providerAddress;

    @OneToOne
    @JoinColumn(name = "provider_id")
    private Provider provider;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTelephonNumber() {
        return telephonNumber;
    }

    public void setTelephonNumber(int telephonNumber) {
        this.telephonNumber = telephonNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    public ProviderAddress getProviderAddress() {
        return providerAddress;
    }

    public void setProviderAddress(ProviderAddress providerAddress) {
        this.providerAddress = providerAddress;
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
        if (!(o instanceof ProviderContact)) return false;
        ProviderContact that = (ProviderContact) o;
        return getTelephonNumber() == that.getTelephonNumber() && getFax() == that.getFax() && Objects.equals(getId(), that.getId()) && Objects.equals(getEmailAddress(), that.getEmailAddress()) && Objects.equals(getProviderAddress(), that.getProviderAddress()) && Objects.equals(getProvider(), that.getProvider());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTelephonNumber(), getEmailAddress(), getFax(), getProviderAddress(), getProvider());
    }
}
