package org.example.hostingdemo.services;

import org.example.hostingdemo.model.User;
import org.example.hostingdemo.repository.UserRepository;
import org.example.hostingdemo.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class UserService implements UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
