package lab.c505.dao;

import lab.c505.entity.RoutineBlood;

public interface RoutineBloodMapper {
    int deleteByPrimaryKey(Long rb_id);

    int insert(RoutineBlood record);

    int insertSelective(RoutineBlood record);

    RoutineBlood selectByPrimaryKey(Long rb_id);

    int updateByPrimaryKeySelective(RoutineBlood record);

    int updateByPrimaryKey(RoutineBlood record);
}