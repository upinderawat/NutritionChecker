package com.foodadditive.NutritionChecker.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "additive_usage")
public class AdditiveUsage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usage_id")
    private int usageId;

    @ManyToOne
    @JoinColumn(name = "additive_id")
    private Additive additive;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @Column(name = "food_product_category")
    private String foodProductCategory;

    @Column(precision = 5, scale = 2, name = "max_concentration")
    private BigDecimal maxConcentration;
    @Column(name = "approval_status")
    private String approvalStatus;
    private String notes;

    // Constructor
    public AdditiveUsage() {}

    // Getters and Setters
    public int getUsageId() {
        return usageId;
    }

    public void setUsageId(int usageId) {
        this.usageId = usageId;
    }

    public Additive getAdditive() {
        return additive;
    }

    public void setAdditive(Additive additive) {
        this.additive = additive;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getFoodProductCategory() {
        return foodProductCategory;
    }

    public void setFoodProductCategory(String foodProductCategory) {
        this.foodProductCategory = foodProductCategory;
    }

    public BigDecimal getMaxConcentration() {
        return maxConcentration;
    }

    public void setMaxConcentration(BigDecimal maxConcentration) {
        this.maxConcentration = maxConcentration;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
