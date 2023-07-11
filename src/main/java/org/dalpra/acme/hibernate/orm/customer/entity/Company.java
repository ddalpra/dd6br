package org.dalpra.acme.hibernate.orm.customer.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Company extends BaseEntity{
    @Column
    private String businessName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "registeredOffice", referencedColumnName = "id")
    private Address registeredOffice;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contactCompany", referencedColumnName = "id")
    private Contact contactCompany;

    public Company() {

    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public Address getRegisteredOffice() {
        return registeredOffice;
    }

    public void setRegisteredOffice(Address registeredOffice) {
        this.registeredOffice = registeredOffice;
    }

    public Contact getContactCompany() {
        return contactCompany;
    }

    public void setContactCompany(Contact contactCompany) {
        this.contactCompany = contactCompany;
    }
}
