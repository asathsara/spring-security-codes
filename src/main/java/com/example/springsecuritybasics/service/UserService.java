package com.example.springsecuritybasics.service;

import com.example.springsecuritybasics.model.Users;
import com.example.springsecuritybasics.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public Users register(Users user){

        // Bcrypt the password
        user.setPassword(encoder.encode(user.getPassword()));

        userRepository.save(user);
        return user;
    }
}
