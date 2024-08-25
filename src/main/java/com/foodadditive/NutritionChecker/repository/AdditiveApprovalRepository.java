package com.foodadditive.NutritionChecker.repository;

import com.foodadditive.NutritionChecker.model.AdditiveApproval;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdditiveApprovalRepository extends JpaRepository<AdditiveApproval, Integer> {
}
