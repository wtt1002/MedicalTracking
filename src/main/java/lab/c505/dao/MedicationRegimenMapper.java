package lab.c505.dao;

import lab.c505.entity.MedicationRegimen;

public interface MedicationRegimenMapper {
    int deleteByPrimaryKey(Long mr_id);

    int insert(MedicationRegimen record);

    int insertSelective(MedicationRegimen record);

    MedicationRegimen selectByPrimaryKey(Long mr_id);

    int updateByPrimaryKeySelective(MedicationRegimen record);

    int updateByPrimaryKey(MedicationRegimen record);
}