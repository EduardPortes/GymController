package com.portes.demo.repositories;

import com.portes.demo.entities.User;
import com.portes.demo.repositories.custom.UserRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID>, UserRepositoryCustom {

    User findByName(String name);

}
