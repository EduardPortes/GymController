package com.portes.demo.controller;


import com.portes.demo.entities.Exercise;
import com.portes.demo.repositories.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/exercise")
public class ExerciseController {

    @Autowired
    private ExerciseRepository repository;

    @GetMapping
    public List<Exercise > filtrar(@RequestParam(required = false) String exerciseID,
                                   @RequestParam(required = false) String name,
                                   @RequestParam(required = false) String description,
                                   @RequestParam(required = false) String category,
                                   @RequestParam(required = false) String difficulty,
                                   @RequestParam(required = false) String muscle) {

        return repository.filtrar(exerciseID, name, description, category, difficulty, muscle);
    }


}
