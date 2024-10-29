package com.foodadditive.NutritionChecker.model;

import jakarta.persistence.*;

@Entity
@Table(name = "additives")
public class Additive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "additive_id")
    private int additiveId;

    @Column(nullable = false)
    private String name;

    @Column(name = "e_number")
    private String eNumber;
    private String description;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private AdditiveClass additiveClass;

    private String notes;

    // Constructor
    public Additive() {}

    // Getters and Setters
    public int getAdditiveId() {
        return additiveId;
    }

    public void setAdditiveId(int additiveId) {
        this.additiveId = additiveId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getENumber() {
        return eNumber;
    }

    public void setENumber(String eNumber) {
        this.eNumber = eNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AdditiveClass getAdditiveClass() {
        return additiveClass;
    }

    public void setAdditiveClass(AdditiveClass additiveClass) {
        this.additiveClass = additiveClass;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
