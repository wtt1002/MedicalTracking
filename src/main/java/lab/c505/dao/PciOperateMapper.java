package lab.c505.dao;

import lab.c505.entity.PciOperate;

public interface PciOperateMapper {
    int deleteByPrimaryKey(Long po_id);

    int insert(PciOperate record);

    int insertSelective(PciOperate record);

    PciOperate selectByPrimaryKey(Long po_id);

    int updateByPrimaryKeySelective(PciOperate record);

    int updateByPrimaryKey(PciOperate record);
}