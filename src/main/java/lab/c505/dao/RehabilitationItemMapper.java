package lab.c505.dao;

import lab.c505.entity.RehabilitationItem;

public interface RehabilitationItemMapper {
    int deleteByPrimaryKey(String rehabilitation_item_id);

    int insert(RehabilitationItem record);

    int insertSelective(RehabilitationItem record);

    RehabilitationItem selectByPrimaryKey(String rehabilitation_item_id);

    int updateByPrimaryKeySelective(RehabilitationItem record);

    int updateByPrimaryKey(RehabilitationItem record);
}