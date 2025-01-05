package com.portes.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "exercise")
public class Exercise implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "exerciseID")
    private String exerciseID;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "videoUrl")
    private String videoUrl;

    @Column(name = "imageUrl")
    private String imageUrl;

    @Column(name = "category")
    private String category;

    @Column(name = "difficulty")
    private String difficulty;

    @ManyToOne
    @JoinColumn(name = "musclegroupid")
    private MusclesGroup musclesgroup;

    @Column(name = "instructions")
    private String instructions;

    @Column(name = "tips")
    private String tips;

    @Column(name = "warning")
    private String warning;

    @Column(name = "benefits")
    private String benefits;

    public Exercise() {
    }

    public Exercise(String ExerciseID, String name, String description, String videoUrl, String imageUrl, String category, String difficulty, MusclesGroup muscle, String instructions, String tips, String warning, String benefits) {
        this.exerciseID = ExerciseID;
        this.name = name;
        this.description = description;
        this.videoUrl = videoUrl;
        this.imageUrl = imageUrl;
        this.category = category;
        this.difficulty = difficulty;
        this.musclesgroup = muscle;
        this.instructions = instructions;
        this.tips = tips;
        this.warning = warning;
        this.benefits = benefits;
    }

    public String getExerciseID() {
        return exerciseID;
    }

    public void setExerciseID(String ExerciseID) {
        this.exerciseID = ExerciseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public MusclesGroup getMusclesGroup() {
        return musclesgroup;
    }

    public void setMusclesGroup(MusclesGroup muscle) {
        this.musclesgroup = muscle;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }
}
