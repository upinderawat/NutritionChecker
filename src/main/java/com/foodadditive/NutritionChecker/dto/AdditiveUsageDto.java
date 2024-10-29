package com.foodadditive.NutritionChecker.dto;

import java.math.BigDecimal;

public class AdditiveUsageDto {

    private String approvalStatus;
    private BigDecimal maxConcentration;
    private String additiveName;

    public AdditiveUsageDto(String approvalStatus, BigDecimal maxConcentration, String additiveName) {
        this.approvalStatus = approvalStatus;
        this.maxConcentration = maxConcentration;
        this.additiveName = additiveName;
    }

    // Getters and Setters
    public String getApprovalStatus() { return approvalStatus; }
    public void setApprovalStatus(String approvalStatus) { this.approvalStatus = approvalStatus; }

    public BigDecimal getMaxConcentration() { return maxConcentration; }
    public void setMaxConcentration(BigDecimal maxConcentration) { this.maxConcentration = maxConcentration; }

    public String getAdditiveName() { return additiveName; }
    public void setAdditiveName(String additiveName) { this.additiveName = additiveName; }
}
