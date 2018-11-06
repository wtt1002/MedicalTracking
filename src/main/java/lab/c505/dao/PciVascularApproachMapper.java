package lab.c505.dao;

import lab.c505.entity.PciVascularApproach;

public interface PciVascularApproachMapper {
    int deleteByPrimaryKey(Long pva_id);

    int insert(PciVascularApproach record);

    int insertSelective(PciVascularApproach record);

    PciVascularApproach selectByPrimaryKey(Long pva_id);

    int updateByPrimaryKeySelective(PciVascularApproach record);

    int updateByPrimaryKey(PciVascularApproach record);
}