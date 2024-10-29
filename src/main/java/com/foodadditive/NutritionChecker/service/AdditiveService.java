package com.foodadditive.NutritionChecker.service;

import com.foodadditive.NutritionChecker.model.Additive;
import com.foodadditive.NutritionChecker.repository.AdditiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdditiveService {
    private final AdditiveRepository additiveRepository;
    @Autowired
    public AdditiveService(AdditiveRepository additiveRepository){
        this.additiveRepository = additiveRepository;
    }
    public Additive getAdditiveById(Integer additiveId){
        return additiveRepository.findByAdditiveId(additiveId);
    }
}
