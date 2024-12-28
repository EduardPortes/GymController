package com.portes.demo.service;

import com.portes.demo.entities.UserType;
import com.portes.demo.entities.User;
import com.portes.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> filtrar(UUID userId, String name, String email, UserType userType) {
        return userRepository.filtrar(userId, name, email, userType);
    }

    public User authenticate(String username, String password) {

        User user = userRepository.findByName(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public User getUserByUsername(String username) {
        return userRepository.findByName(username);
    }

}
