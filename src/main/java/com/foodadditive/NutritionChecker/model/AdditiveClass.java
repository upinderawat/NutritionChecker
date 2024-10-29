package com.foodadditive.NutritionChecker.model;

import jakarta.persistence.*;

@Entity
@Table(name = "additive_class")
public class AdditiveClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private int classId;

    @Column(nullable = false, name = "class_name")
    private String className;

    private String description;

    // Constructor
    public AdditiveClass() {}

    // Getters and Setters
    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
