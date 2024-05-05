package com.api.rest.accounts.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.api.rest.accounts.models.CreateOrUpdateUserRequest;
import com.api.rest.accounts.models.User;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
    private Map<UUID, User> users = new HashMap<>(); // this is our datebase

    @PostMapping("")
    public User createUser(@RequestBody CreateOrUpdateUserRequest request /* request to create user */) {
        // instantiate a new user
        var user = new User(request.getName(),
                request.getUsername(),
                request.getPassword());
        // save the user in the database
        users.put(user.getId(), user);
        return user; // return the created user

    }

    @GetMapping("")
    public List<User> listUsers() {
        return new ArrayList<>(users.values());
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {
        var uuid = UUID.fromString(id);
        var user = users.get(uuid);
        return user;
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable String id, @RequestBody CreateOrUpdateUserRequest request) {
        var uuid = UUID.fromString(id);
        var user = users.get(uuid);
        user.setName(request.getName());
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        users.put(user.getId(), user);
        return user;

    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        var uuid = UUID.fromString(id);
        users.remove(uuid);
    }

}
