package com.itechart.warehouse.core.entity;

import javax.persistence.*;

@MappedSuperclass
public class Entity {
    private Integer id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, insertable = true, updatable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
