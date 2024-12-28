package com.portes.demo.repositories.custom;

import com.portes.demo.entities.UserType;
import com.portes.demo.entities.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepositoryCustom {

    List<User> filtrar(UUID userId, String name, String email, UserType userType);

}
