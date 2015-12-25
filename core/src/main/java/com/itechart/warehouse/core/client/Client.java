package com.itechart.warehouse.core.client;

import com.itechart.warehouse.core.entity.Entity;

import javax.persistence.*;
import java.sql.Timestamp;

@javax.persistence.Entity
@Table(name = "client")
public class Client extends Entity {

    private String name;
    private Timestamp dateOfRegistration;
    private State state;
    private Timestamp lastModified;
    private Boolean shown;

    @Column(name = "name", nullable = false, insertable = true, updatable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "registration_date", nullable = false, insertable = true, updatable = true)
    public Timestamp getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(Timestamp dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "state", nullable = false, insertable = true, updatable = true)
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Column(name = "last_modified_date", nullable = false, insertable = true, updatable = true)
    public Timestamp getLastModified() {
        return lastModified;
    }

    public void setLastModified(Timestamp lastModified) {
        this.lastModified = lastModified;
    }

    @Column(name = "shown", nullable = false, insertable = true, updatable = true)
    public Boolean getShown() {
        return shown;
    }

    public void setShown(Boolean shown) {
        this.shown = shown;
    }
}
