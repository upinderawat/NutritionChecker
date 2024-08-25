package com.foodadditive.NutritionChecker.service;

import com.foodadditive.NutritionChecker.model.Additive;
import com.foodadditive.NutritionChecker.repository.AdditiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdditiveService {

    @Autowired
    private AdditiveRepository additiveRepository;

    public List<Additive> findAll() {
        return additiveRepository.findAll();
    }

    public Optional<Additive> findById(Integer id) {
        return additiveRepository.findById(id);
    }

    public Additive save(Additive additive) {
        return additiveRepository.save(additive);
    }

    public void deleteById(Integer id) {
        additiveRepository.deleteById(id);
    }
}