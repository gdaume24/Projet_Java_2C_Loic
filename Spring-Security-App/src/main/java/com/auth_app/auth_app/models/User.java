package com.auth_app.auth_app.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "USER")
public class User {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "EMAIL")
    private String emailString;

    @Column(name = "password")
    private String password;
}