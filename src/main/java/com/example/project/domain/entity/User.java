package com.example.project.domain.entity;


import java.util.UUID;

public class User {

    private UUID uidd;
    private String email;
    private String password;

    public User(){

    }

    public User(String email, String password){
        this.email = email;
        this.password = password;
        this.uidd = uidd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UUID getUuid() {
        return this.uidd;
    }

    public void setUidd(UUID uidd) {
        this.uidd = uidd;
    }
}
