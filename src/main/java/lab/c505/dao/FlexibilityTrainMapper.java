package lab.c505.dao;

import lab.c505.entity.FlexibilityTrain;

public interface FlexibilityTrainMapper {
    int deleteByPrimaryKey(Long ft_id);

    int insert(FlexibilityTrain record);

    int insertSelective(FlexibilityTrain record);

    FlexibilityTrain selectByPrimaryKey(Long ft_id);

    int updateByPrimaryKeySelective(FlexibilityTrain record);

    int updateByPrimaryKey(FlexibilityTrain record);
}