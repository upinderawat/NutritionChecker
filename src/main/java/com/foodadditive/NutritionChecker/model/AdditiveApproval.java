package com.foodadditive.NutritionChecker.model;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "additive_approval")
public class AdditiveApproval {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer approvalId;

    @ManyToOne
    @JoinColumn(name = "additive_id")
    private Additive additive;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    private String approvalStatus;

    @Column(columnDefinition = "TEXT")
    private String notes;
}
