package com.portes.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "user_type")
public class UserType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_typeID")
    private Long user_typeId;

    @Column(name = "name")
    private String name;

    public UserType() {
    }

    public UserType(Long roleId, String name) {
        this.user_typeId = roleId;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(Long roleId) {
        this.user_typeId = roleId;
    }

    public Long getRoleId() {
        return user_typeId;
    }
}
