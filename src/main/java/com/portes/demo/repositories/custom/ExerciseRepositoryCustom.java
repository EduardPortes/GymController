package com.portes.demo.repositories.custom;

import com.portes.demo.entities.Exercise;

import java.util.List;
import java.util.UUID;

public interface ExerciseRepositoryCustom {

    List<Exercise> filtrar(String exerciseID, String name, String description, String category, String difficulty, String muscle);
}
