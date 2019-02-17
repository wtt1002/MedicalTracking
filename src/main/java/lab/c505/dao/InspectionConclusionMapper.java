package lab.c505.dao;

import lab.c505.entity.InspectionConclusion;

public interface InspectionConclusionMapper {
    int deleteByPrimaryKey(String inspection_conclusion_id);

    int insert(InspectionConclusion record);

    int insertSelective(InspectionConclusion record);

    InspectionConclusion selectByPrimaryKey(String inspection_conclusion_id);

    int updateByPrimaryKeySelective(InspectionConclusion record);

    int updateByPrimaryKey(InspectionConclusion record);
}