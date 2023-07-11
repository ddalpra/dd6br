package org.dalpra.acme.hibernate.orm.customer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;


import java.time.LocalDateTime;

@Entity
public class Contact extends BaseEntity{
    @Column
    private String email;
    @Column
    private String phoneNumber;
    @Column
    private String labelContact;

    public Contact() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLabelContact() {
        return labelContact;
    }

    public void setLabelContact(String labelContact) {
        this.labelContact = labelContact;
    }

}
