package com.portes.demo.repositories;

import com.portes.demo.entities.Exercise;
import com.portes.demo.repositories.custom.ExerciseRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ExerciseRepository extends JpaRepository<Exercise, UUID>, ExerciseRepositoryCustom {
}
