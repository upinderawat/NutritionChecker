package com.foodadditive.NutritionChecker.controller;

import com.foodadditive.NutritionChecker.dto.AdditiveUsageDto;
import com.foodadditive.NutritionChecker.model.Additive;
import com.foodadditive.NutritionChecker.service.AdditiveService;
import com.foodadditive.NutritionChecker.service.AdditiveUsageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/nutricheck/")
public class AdditiveController {
    private final AdditiveUsageService additiveUsageService;
    private final AdditiveService additiveService;
    @Autowired
    public AdditiveController(AdditiveUsageService additiveUsageService, AdditiveService additiveService) {
        this.additiveUsageService = additiveUsageService;
        this.additiveService = additiveService;
    }
    @GetMapping("/approval-status")
    public List<AdditiveUsageDto> getApprovalStatusAndMaxConcentration(
                @RequestParam String country,
            @RequestParam String foodProductCategory,
            @RequestParam List<String> additivesList) {
        
        return additiveUsageService.getAdditiveApprovalStatusAndMaxConcentration(country, foodProductCategory, additivesList);
    }
    @GetMapping("/additive")
    public Additive getAdditiveById(
            @RequestParam Integer additiveId) {
        return additiveService.getAdditiveById(additiveId);
    }
}
