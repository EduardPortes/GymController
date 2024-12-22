package com.portes.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "role")
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "roleId")
    private UUID roleId;
    @Column(name = "name")
    private String name;

    public Role() {
    }

    public Role(UUID roleId, String name) {
        this.roleId = roleId;
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setId(UUID roleId) {
        this.roleId = roleId;
    }

    public UUID getRoleId() {
        return roleId;
    }
}
