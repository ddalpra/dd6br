package org.dalpra.acme.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.dalpra.acme.Stato;

import java.util.UUID;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private UUID uid;
    private String username;
    private String firstname;
    private String lastname;
    private Stato status;

    public UUID getUid() {
        return uid;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Stato getStatus() {
        return status;
    }

    public void setStatus(Stato status) {
        this.status = status;
    }
}
