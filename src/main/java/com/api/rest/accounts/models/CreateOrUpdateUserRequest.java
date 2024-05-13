package com.api.rest.accounts.models;

public class CreateOrUpdateUserRequest {
    private String name;
    private String username;
    private String password;

    public CreateOrUpdateUserRequest(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return "encrypted";
    }
}

// server.

/*
 * curl -X POST "http://localhost:8080/users" -H
 * "Content-Type: application/json" -d
 * '{"name":"Vitor","username":"Y2J","password":"123"}'
 * curl -X POST "http://localhost:8080/users" -H
 * "Content-Type: application/json" -d
 * '{"name":"SimbaMeuBoi","username":"Simba","password":"1234"}'
 * 
 * curl -X GET "http://localhost:8080/users"
 * 
 * curl -X GET "http://localhost:8080/users"
 * 
 * curl -X GET
 * "http://localhost:8080/users/6014d695-462e-4dcb-8547-ba46b1a84c47"
 * 
 * curl -X PUT
 * "http://localhost:8080/users/6014d695-462e-4dcb-8547-ba46b1a84c47" -H
 * "Content-Type: application/json" -d
 * '{"name":"novas","username":"y2k","password":"123"}'
 * 
 * curl -i -X DELETE
 * "http://localhost:8080/users/4e4bcf98-2501-422d-afab-1180389a4fb3"
 */
