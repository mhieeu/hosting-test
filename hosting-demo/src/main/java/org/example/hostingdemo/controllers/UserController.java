package org.example.hostingdemo.controllers;

import org.example.hostingdemo.model.User;
import org.example.hostingdemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findAllUsers")
    public List<User> findAllUsers() {
        return userService.getAllUsers();
    }
}
