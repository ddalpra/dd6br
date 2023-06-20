package org.dalpra.acme.hibernate.orm.customer.entity;

import jakarta.persistence.*;
import org.apache.commons.lang3.ObjectUtils;
import org.dalpra.acme.hibernate.orm.utility.Stato;
import org.hibernate.annotations.CreationTimestamp;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@NamedQuery(name = "Customers.findAll",
        query = "SELECT c FROM Customer c ORDER BY c.id")
@NamedQuery(name = "Customers.findById",
        query = "SELECT c FROM Customer c WHERE c.id = :id")
public class Customer {
    @Id
    @SequenceGenerator(
            name = "customerSequence",
            sequenceName = "customerId_seq",
            allocationSize = 1,
            initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customerSequence")
    private Long id;
    @Column(length = 40)
    private String name;
    @Column(length = 40)
    private String surname;
    @Column(length = 250)
    private String email;

    @Column(nullable = false)
    @CreationTimestamp
    private LocalDate dob;
    @Column(nullable = false)
    @CreationTimestamp
    private LocalDateTime createAt;
    @Column(nullable = false)
    @CreationTimestamp
    private LocalDateTime updateAt;
    @Column(nullable = false)
    private Stato state;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public LocalDateTime getCreateAt() {
        return createAt;
    }
    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }
    public LocalDateTime getUpdateAt() {
        return updateAt;
    }
    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
    public Stato getState() {
        return state;
    }
    public void setState(Stato state) {
        this.state = state;
    }

    public boolean isNull() {
        boolean result = ObjectUtils.allNull(this);
        return result;
    }
}