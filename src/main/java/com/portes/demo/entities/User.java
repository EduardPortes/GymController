package com.portes.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "userID")
    private UUID userID;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @ManyToOne
    @JoinColumn(name = "roleID")
    private Role roleID;

    public User() {
    }

    public User(UUID id, String name, String email, String password, Role roles) {
        this.userID = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.roleID = roles;
    }

    public UUID getId() {
        return userID;
    }

    public void setId(UUID id) {
        this.userID = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRoles() {
        return roleID;
    }

    public void setRoles(Role roles) {
        this.roleID = roles;
    }
}
