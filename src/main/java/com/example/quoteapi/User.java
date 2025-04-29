package com.example.quoteapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Makes it a JPA entity

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public User() {}


    public User(Long userId, String username, String firstName,
                String lastName, String password) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //getters
    public Long getId() {return userId; }
    public String getUsername() { return username; }
    public String getPassword() {return password;}
    public String getFirstName() {return firstName; }
    public String getLastName() {return lastName;}

    //setters
    public void setUserId(Long id) {this.userId = id;}
    public void setUsername(String u) { this.username = u; }
    public void setPassword(String p) {this.password = p; }
    public void setFirstName(String f) {this.firstName = f; }
    public void setLastName(String l) {this.lastName = l; }










}
