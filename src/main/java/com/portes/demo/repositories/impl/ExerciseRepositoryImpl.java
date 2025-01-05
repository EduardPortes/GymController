package com.portes.demo.repositories.impl;

import com.portes.demo.entities.Exercise;
import com.portes.demo.repositories.custom.ExerciseRepositoryCustom;
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

public class ExerciseRepositoryImpl implements ExerciseRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Exercise> filtrar(String exerciseID, String name, String description, String category, String difficulty, String muscle) {

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Exercise> cq = cb.createQuery(Exercise.class);
        Root<Exercise> exercise = cq.from(Exercise.class);

        List<Predicate> predicates = new ArrayList<>();

        if (exerciseID != null) {
            predicates.add(cb.equal(exercise.get("exerciseID"), exerciseID));
        }

        if (name != null && !name.isEmpty()) {
            predicates.add(cb.like(exercise.get("name"), "%" + name + "%"));
        }

        if (description != null && !description.isEmpty()) {
            predicates.add(cb.like(exercise.get("description"), "%" + description + "%"));
        }

        if (category != null && !category.isEmpty()) {
            predicates.add(cb.like(exercise.get("category"), "%" + category + "%"));
        }

        if (difficulty != null && !difficulty.isEmpty()) {
            predicates.add(cb.like(exercise.get("difficulty"), "%" + difficulty + "%"));
        }

        if (muscle != null && !muscle.isEmpty()) {
            predicates.add(cb.like(exercise.get("muscle"), "%" + muscle + "%"));
        }

        cq.where(predicates.toArray(new Predicate[0]));

        TypedQuery<Exercise> query = entityManager.createQuery(cq);
        return query.getResultList();
    }
}