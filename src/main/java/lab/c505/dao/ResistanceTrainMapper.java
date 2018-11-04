package lab.c505.dao;

import lab.c505.entity.ResistanceTrain;

public interface ResistanceTrainMapper {
    int deleteByPrimaryKey(Long rst_id);

    int insert(ResistanceTrain record);

    int insertSelective(ResistanceTrain record);

    ResistanceTrain selectByPrimaryKey(Long rst_id);

    int updateByPrimaryKeySelective(ResistanceTrain record);

    int updateByPrimaryKey(ResistanceTrain record);
}