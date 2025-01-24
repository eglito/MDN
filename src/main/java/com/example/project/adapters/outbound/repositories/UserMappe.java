package com.example.project.adapters.outbound.repositories;

import com.example.project.domain.dto.UserDTO;
import com.example.project.domain.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMappe {

    UserDTO toUserDTO (User user);
    User toUser(UserDTO userDTO);
}
