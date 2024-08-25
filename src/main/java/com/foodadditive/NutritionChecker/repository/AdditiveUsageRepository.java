package com.foodadditive.NutritionChecker.repository;

import com.foodadditive.NutritionChecker.model.AdditiveUsage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdditiveUsageRepository extends JpaRepository<AdditiveUsage, Integer> {
}
