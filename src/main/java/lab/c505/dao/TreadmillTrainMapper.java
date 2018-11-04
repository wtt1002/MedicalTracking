package lab.c505.dao;

import lab.c505.entity.TreadmillTrain;

public interface TreadmillTrainMapper {
    int deleteByPrimaryKey(Long tt_id);

    int insert(TreadmillTrain record);

    int insertSelective(TreadmillTrain record);

    TreadmillTrain selectByPrimaryKey(Long tt_id);

    int updateByPrimaryKeySelective(TreadmillTrain record);

    int updateByPrimaryKey(TreadmillTrain record);
}