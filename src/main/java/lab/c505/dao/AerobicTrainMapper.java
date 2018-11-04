package lab.c505.dao;

import lab.c505.entity.AerobicTrain;

public interface AerobicTrainMapper {
    int deleteByPrimaryKey(Long at_id);

    int insert(AerobicTrain record);

    int insertSelective(AerobicTrain record);

    AerobicTrain selectByPrimaryKey(Long at_id);

    int updateByPrimaryKeySelective(AerobicTrain record);

    int updateByPrimaryKey(AerobicTrain record);
}