package com.itechart.warehouse.core.client;

import javax.persistence.*;
import java.util.Date;

@javax.persistence.Entity
@Table(name = "CLIENT")
public class Client extends com.itechart.warehouse.core.entity.Entity{

    private String name;
    private Date registrationDate;
    private State state;
    private Date lastModifiedDate;
    private Boolean shown;

    @Column(name = "NAME", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "REGISTRATION_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Column(name = "STATE", nullable = false)
    @Enumerated(EnumType.STRING)
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Column(name = "LAST_MODIFIED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Column(name = "SHOWN", nullable = false)
    public Boolean getShown() {
        return shown;
    }

    public void setShown(Boolean shown) {
        this.shown = shown;
    }

    public static enum State {
        ACTIVE, SUSPENDED;
    }
}
