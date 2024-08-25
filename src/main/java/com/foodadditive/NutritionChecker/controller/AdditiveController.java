package com.foodadditive.NutritionChecker.controller;

import com.foodadditive.NutritionChecker.model.Additive;
import com.foodadditive.NutritionChecker.service.AdditiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/v1/api/additive/")
public class AdditiveController {
    @Autowired
    private AdditiveService additiveService;
    @GetMapping("/all")
    public List<Additive> getAllAdditives(){
        return additiveService.findAll();
    }
}
