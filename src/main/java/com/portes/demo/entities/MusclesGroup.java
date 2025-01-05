package com.portes.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "musclesgroup")
public class MusclesGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "musclesgroupid")
    private Long musclesgroupId;

    @Column(name = "name")
    private String name;

    public MusclesGroup() {
    }

    public MusclesGroup(Long musclesgroupid, String name) {
        this.musclesgroupId = musclesgroupid;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMusclesGroupId(Long musclesgroupid) {
        this.musclesgroupId = musclesgroupid;
    }

    public Long getMusclesgroupId() {
        return musclesgroupId;
    }

}
