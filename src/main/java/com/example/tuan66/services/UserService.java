package com.example.tuan66.services;


import com.example.tuan66.entities.User;
import com.example.tuan66.repositories.UserRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepositoty userRepositoty;


    public User findUserByRegisteredAt(String registeredAt) {
         return userRepositoty.findUserByRegisteredAt(registeredAt);

    }
}
