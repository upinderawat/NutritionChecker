package com.foodadditive.NutritionChecker.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import jakarta.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "additives")
public class Additive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer additiveId;

    private String name;
    private String eNumber;

    @Column(columnDefinition = "TEXT")
    private String description;

    @ManyToOne
    @JoinColumn(name = "class_id")
    @JsonIgnore
    private Class classes;

    private String status;

    @Column(columnDefinition = "TEXT")
    private String notes;

    @OneToMany(mappedBy = "additive", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<AdditiveApproval> approvals;

    @OneToMany(mappedBy = "additive", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<AdditiveUsage> usages;
}