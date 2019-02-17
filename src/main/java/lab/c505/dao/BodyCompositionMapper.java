package lab.c505.dao;

import lab.c505.entity.BodyComposition;

public interface BodyCompositionMapper {
    int deleteByPrimaryKey(String body_composition_id);

    int insert(BodyComposition record);

    int insertSelective(BodyComposition record);

    BodyComposition selectByPrimaryKey(String body_composition_id);

    int updateByPrimaryKeySelective(BodyComposition record);

    int updateByPrimaryKey(BodyComposition record);
}