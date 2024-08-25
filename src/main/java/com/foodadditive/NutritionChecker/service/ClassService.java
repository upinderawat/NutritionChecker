package com.foodadditive.NutritionChecker.service;

import com.foodadditive.NutritionChecker.model.Class;
import com.foodadditive.NutritionChecker.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClassService {

    @Autowired
    private ClassRepository classRepository;

    public List<Class> findAll() {
        return classRepository.findAll();
    }

    public Optional<Class> findById(Integer id) {
        return classRepository.findById(id);
    }

    public Class save(Class classObj) {
        return classRepository.save(classObj);
    }

    public void deleteById(Integer id) {
        classRepository.deleteById(id);
    }
}