package com.portes.demo.repositories;

import com.portes.demo.entities.User;
import com.portes.demo.repositories.custom.UserRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {

    User findByName(String name);

}
