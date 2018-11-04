package lab.c505.dao;

import lab.c505.entity.BreathTrain;

public interface BreathTrainMapper {
    int deleteByPrimaryKey(Long bt_id);

    int insert(BreathTrain record);

    int insertSelective(BreathTrain record);

    BreathTrain selectByPrimaryKey(Long bt_id);

    int updateByPrimaryKeySelective(BreathTrain record);

    int updateByPrimaryKey(BreathTrain record);
}