package com.example.project.utils.mapper;

import com.example.project.domain.dto.UserDTO;
import com.example.project.domain.entity.User;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserMapper {

    public User toEntity(UserDTO userDTO){
        User user = new User();
        user.setEmail(userDTO.getEmail());
        user.setUidd(UUID.randomUUID());
        return user;
    }

    public UserDTO toUserDTO(User user){
        UserDTO userDTO = new UserDTO(user.getEmail(), user.getUuid());
        return userDTO;
    }
}
