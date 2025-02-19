package com.rest.webservices.restful_web_services.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

    private UserDaoService service;

    public UserResource(UserDaoService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id) {
        return service.findUserWithId(id);
    }

    @PostMapping("/users")
    public void createUser(@RequestBody User user) {
        service.saveUser(user);
    }
}
