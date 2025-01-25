package com.example.project.adapters.inbound.controller;

import java.util.List;
import java.util.UUID;

import com.example.project.adapters.outbound.repositories.UserRepository;
import com.example.project.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "adapters/outbound/entities/JPAUserEntity.java")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll(){
        List<User> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{uuid}") //busca a partir do código UUID
    public User findByUIDD(@PathVariable UUID uuid){
        User result = repository.findById(uuid).get();
        return result;
    }

    public User insert(@RequestBody User user){
        User result = repository.save(user);
        return result;
    }

}
