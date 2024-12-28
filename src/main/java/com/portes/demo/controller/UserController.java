package com.portes.demo.controller;

import com.portes.demo.entities.UserType;
import com.portes.demo.entities.User;
import com.portes.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    
    @GetMapping
    public List<User> filtrar(@RequestParam(required = false) UUID userId,
                              @RequestParam(required = false) String name,
                              @RequestParam(required = false) String email,
                              @RequestParam(required = false) UserType userType) {
        List<User> users = userService.filtrar(userId, name, email, userType);
        return users;
    }

}