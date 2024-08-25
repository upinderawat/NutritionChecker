package com.foodadditive.NutritionChecker.repository;

import com.foodadditive.NutritionChecker.model.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<Class, Integer> {
}

