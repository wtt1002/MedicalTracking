package lab.c505.dao;

import lab.c505.entity.PciScore;

public interface PciScoreMapper {
    int deleteByPrimaryKey(Long pcis_id);

    int insert(PciScore record);

    int insertSelective(PciScore record);

    PciScore selectByPrimaryKey(Long pcis_id);

    int updateByPrimaryKeySelective(PciScore record);

    int updateByPrimaryKey(PciScore record);
}