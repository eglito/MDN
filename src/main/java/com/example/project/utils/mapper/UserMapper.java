package com.example.project.utils.mapper;

import com.example.project.adapters.outbound.repositories.UserMappe;
import com.example.project.domain.dto.UserDTO;
import com.example.project.domain.entity.User;

import java.util.UUID;

public class UserMapper implements UserMappe {

    @Override
    public UserDTO toUserDTO (User user){
        if(user == null){
            return null;
        }
        UserDTO userDTO = new UserDTO(user.getEmail(), user.getUuid());
        return userDTO;
    }

    @Override
    public User toUser(UserDTO userDTO){
        if(userDTO == null){
            return null;
        }
        User user = new User();
        user.setEmail(userDTO.getEmail());
        user.setUidd(UUID.randomUUID());
        return user;
    }

}
