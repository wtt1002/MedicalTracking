package lab.c505.dao;

import lab.c505.entity.BikeTrain;

public interface BikeTrainMapper {
    int deleteByPrimaryKey(Long bt_id);

    int insert(BikeTrain record);

    int insertSelective(BikeTrain record);

    BikeTrain selectByPrimaryKey(Long bt_id);

    int updateByPrimaryKeySelective(BikeTrain record);

    int updateByPrimaryKey(BikeTrain record);
}