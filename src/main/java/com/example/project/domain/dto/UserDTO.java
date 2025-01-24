package com.example.project.domain.dto;

import java.util.UUID;

public class UserDTO {

    private String email;
    private UUID uuid;

    public UserDTO() {

    }

    public UserDTO(String email, UUID uuid) {
        this.email = email;
        this.uuid = uuid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UUID getUUID() {
        return this.uuid;
    }

    public void seUUID(UUID uuid) {
        this.uuid = uuid;
    }
}
