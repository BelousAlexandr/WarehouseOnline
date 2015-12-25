package com.itechart.warehouse.core.user;

import com.itechart.warehouse.core.entity.Entity;

import javax.persistence.Column;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "user")
public class User extends Entity{
    private String firstName;

    @Column(name = "first_name", nullable = false, insertable = true, updatable = true, length = 255)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }
}
