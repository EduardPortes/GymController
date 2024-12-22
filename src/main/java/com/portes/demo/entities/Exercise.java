package com.portes.demo.entities;

public class Exercise {

    private int ExerciseID;
    private String name;
    private String description;
    private String videoUrl;
    private String imageUrl;
    private String category;
    private String difficulty;
    private String muscle;
    private String instructions;
    private String tips;
    private String warning;
    private String benefits;

    public Exercise() {
    }

    public Exercise(int ExerciseID,String name, String description, String videoUrl, String imageUrl, String category, String difficulty, String muscle, String instructions, String tips, String warning, String benefits) {
        this.ExerciseID = ExerciseID;
        this.name = name;
        this.description = description;
        this.videoUrl = videoUrl;
        this.imageUrl = imageUrl;
        this.category = category;
        this.difficulty = difficulty;
        this.muscle = muscle;
        this.instructions = instructions;
        this.tips = tips;
        this.warning = warning;
        this.benefits = benefits;
    }

    public int getExerciseID() {
        return ExerciseID;
    }

    public void setExerciseID(int ExerciseID) {
        this.ExerciseID = ExerciseID;
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

    public String getMuscle() {
        return muscle;
    }

    public void setMuscle(String muscle) {
        this.muscle = muscle;
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
