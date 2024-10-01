package com.auth_app.auth_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth_app.auth_app.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    // User findByEmailString(String email);
    // all crud database methods
}   