package com.foodadditive.NutritionChecker.model;


import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "additive_usage")
public class AdditiveUsage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer usageId;

    @ManyToOne
    @JoinColumn(name = "additive_id")
    private Additive additive;

    private String foodProduct;

    private Double maxConcentration;

    @Column(columnDefinition = "TEXT")
    private String notes;
}