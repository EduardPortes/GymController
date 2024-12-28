package com.portes.demo.repositories.impl;

import com.portes.demo.entities.UserType;
import com.portes.demo.entities.User;
import com.portes.demo.repositories.custom.UserRepositoryCustom;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserRepositoryImpl implements UserRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> filtrar(UUID userId, String name, String email, UserType userType) {

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<User> cq = cb.createQuery(User.class);
        Root<User> user = cq.from(User.class);

        List<Predicate> predicates = new ArrayList<>();

        if (userId != null) {
            predicates.add(cb.equal(user.get("userId"), userId));
        }

        if (name != null && !name.isEmpty()) {
            predicates.add(cb.like(user.get("name"), "%" + name + "%"));
        }

        if (email != null && !email.isEmpty()) {
            predicates.add(cb.like(user.get("email"), "%" + email + "%"));
        }

        if (userType != null) {
            predicates.add(cb.equal(user.get("userType"), userType));
        }

        cq.where(predicates.toArray(new Predicate[0]));

        TypedQuery<User> query = entityManager.createQuery(cq);
        return query.getResultList();
    }
}