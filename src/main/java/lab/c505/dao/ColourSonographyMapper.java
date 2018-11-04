package lab.c505.dao;

import lab.c505.entity.ColourSonography;

public interface ColourSonographyMapper {
    int deleteByPrimaryKey(Long cs_id);

    int insert(ColourSonography record);

    int insertSelective(ColourSonography record);

    ColourSonography selectByPrimaryKey(Long cs_id);

    int updateByPrimaryKeySelective(ColourSonography record);

    int updateByPrimaryKey(ColourSonography record);
}