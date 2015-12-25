package com.itechart.warehouse.core.user;

import com.itechart.warehouse.core.entity.Entity;

import javax.persistence.Column;

@javax.persistence.Entity
public class User extends Entity{
    private String name;

    @Column(name = "name", nullable = false, insertable = true, updatable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
