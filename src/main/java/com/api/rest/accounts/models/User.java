package com.api.rest.accounts.models;

import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String username;
    private String password;

    public User(String name, String username, String password) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public User(UUID id, String name, String username, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return "encrypted";
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
