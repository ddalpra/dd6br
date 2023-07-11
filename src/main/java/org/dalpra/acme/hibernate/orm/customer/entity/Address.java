package org.dalpra.acme.hibernate.orm.customer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;


import java.time.LocalDateTime;

@Entity
public class Address extends BaseEntity{

    @Column
    private String streetAddress;
    @Column
    private String streetAddress2;
    @Column
    private String country;
    @Column
    private String city;
    @Column
    private String zipCode;
    @Column
    private String note;
    @Column
    private String number;
    @Column
    private String province;

    public Address( ) {

    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getStreetAddress2() {
        return streetAddress2;
    }

    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }


}
