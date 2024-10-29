package com.foodadditive.NutritionChecker.service;

import com.foodadditive.NutritionChecker.dto.AdditiveUsageDto;
import com.foodadditive.NutritionChecker.repository.AdditiveUsageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdditiveUsageService {
    private final AdditiveUsageRepository additiveUsageRepository;

    @Autowired
    public AdditiveUsageService(AdditiveUsageRepository additiveUsageRepository) {
        this.additiveUsageRepository = additiveUsageRepository;
    }

    public List<AdditiveUsageDto> getAdditiveApprovalStatusAndMaxConcentration(String country, String foodProductCategory, List<String> additivesList) {
        return additiveUsageRepository.retrieveApprovalStatusAndMaxConcentration(country, foodProductCategory, additivesList);
    }
}
