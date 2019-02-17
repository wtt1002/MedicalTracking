package lab.c505.dao;

import lab.c505.entity.NutritionPrescription;

public interface NutritionPrescriptionMapper {
    int deleteByPrimaryKey(String nutrition_prescription_id);

    int insert(NutritionPrescription record);

    int insertSelective(NutritionPrescription record);

    NutritionPrescription selectByPrimaryKey(String nutrition_prescription_id);

    int updateByPrimaryKeySelective(NutritionPrescription record);

    int updateByPrimaryKey(NutritionPrescription record);
}