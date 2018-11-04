package lab.c505.dao;

import lab.c505.entity.BodyComp;

public interface BodyCompMapper {
    int deleteByPrimaryKey(Long bc_id);

    int insert(BodyComp record);

    int insertSelective(BodyComp record);

    BodyComp selectByPrimaryKey(Long bc_id);

    int updateByPrimaryKeySelective(BodyComp record);

    int updateByPrimaryKey(BodyComp record);
}