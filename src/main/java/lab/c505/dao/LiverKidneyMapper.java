package lab.c505.dao;

import lab.c505.entity.LiverKidney;

public interface LiverKidneyMapper {
    int deleteByPrimaryKey(Long lk_id);

    int insert(LiverKidney record);

    int insertSelective(LiverKidney record);

    LiverKidney selectByPrimaryKey(Long lk_id);

    int updateByPrimaryKeySelective(LiverKidney record);

    int updateByPrimaryKey(LiverKidney record);
}