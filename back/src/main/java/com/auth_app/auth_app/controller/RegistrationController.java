package com.auth_app.auth_app.controller;

import org.springframework.web.bind.annotation.RestController;

import com.auth_app.auth_app.models.User;
import com.auth_app.auth_app.repository.UserRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/registration")
public class RegistrationController {

    @Value("${SECRET_KEY}")
    private String secretKey;
 
    @Autowired
    private UserRepository userRepository;
    // private final BCryptPasswordEncoder passwordEncoder;

    // Création de l'utilisateur
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}