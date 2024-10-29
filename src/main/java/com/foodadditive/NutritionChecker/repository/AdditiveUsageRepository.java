package com.foodadditive.NutritionChecker.repository;

import com.foodadditive.NutritionChecker.dto.AdditiveUsageDto;
import com.foodadditive.NutritionChecker.model.AdditiveUsage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdditiveUsageRepository extends JpaRepository<AdditiveUsage, Long> {

    @Query("SELECT new com.foodadditive.NutritionChecker.dto.AdditiveUsageDto(au.approvalStatus, au.maxConcentration, a.name) " +
           "FROM AdditiveUsage au " +
           "JOIN au.additive a " +
           "JOIN au.country c " +
           "WHERE c.countryName = :country " +
           "AND au.foodProductCategory = :foodProductCategory " +
           "AND a.name IN :additivesList")
    List<AdditiveUsageDto> retrieveApprovalStatusAndMaxConcentration(
            @Param("country") String country,
            @Param("foodProductCategory") String foodProductCategory,
            @Param("additivesList") List<String> additivesList);

}
