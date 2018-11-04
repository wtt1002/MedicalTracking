package lab.c505.dao;

import lab.c505.entity.NutritionalPrescription;

public interface NutritionalPrescriptionMapper {
    int deleteByPrimaryKey(Long np_id);

    int insert(NutritionalPrescription record);

    int insertSelective(NutritionalPrescription record);

    NutritionalPrescription selectByPrimaryKey(Long np_id);

    int updateByPrimaryKeySelective(NutritionalPrescription record);

    int updateByPrimaryKey(NutritionalPrescription record);
}