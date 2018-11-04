package lab.c505.dao;

import lab.c505.entity.ExerciseCardiopulmonary;

public interface ExerciseCardiopulmonaryMapper {
    int deleteByPrimaryKey(Long ecp_id);

    int insert(ExerciseCardiopulmonary record);

    int insertSelective(ExerciseCardiopulmonary record);

    ExerciseCardiopulmonary selectByPrimaryKey(Long ecp_id);

    int updateByPrimaryKeySelective(ExerciseCardiopulmonary record);

    int updateByPrimaryKey(ExerciseCardiopulmonary record);
}