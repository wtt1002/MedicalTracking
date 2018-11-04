package lab.c505.dao;

import lab.c505.entity.TrainItem;

public interface TrainItemMapper {
    int deleteByPrimaryKey(Long ti_id);

    int insert(TrainItem record);

    int insertSelective(TrainItem record);

    TrainItem selectByPrimaryKey(Long ti_id);

    int updateByPrimaryKeySelective(TrainItem record);

    int updateByPrimaryKey(TrainItem record);
}