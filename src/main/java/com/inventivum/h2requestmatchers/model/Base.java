package com.inventivum.h2requestmatchers.model;

import jakarta.persistence.*;

import java.util.UUID;

@MappedSuperclass
public abstract class Base {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    public Base() {
    }

    public Base(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
