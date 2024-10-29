package com.foodadditive.NutritionChecker.repository;

import com.foodadditive.NutritionChecker.model.Additive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdditiveRepository extends JpaRepository<Additive, Integer> {
    Additive findByAdditiveId(Integer additiveId);
}
