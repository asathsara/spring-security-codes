package com.example.springsecuritybasics.service;

import com.example.springsecuritybasics.model.Users;
import com.example.springsecuritybasics.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Users register(Users user){
        userRepository.save(user);
        return user;
    }
}
