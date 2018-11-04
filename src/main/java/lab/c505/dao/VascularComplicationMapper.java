package lab.c505.dao;

import lab.c505.entity.VascularComplication;

public interface VascularComplicationMapper {
    int deleteByPrimaryKey(Long vcp_id);

    int insert(VascularComplication record);

    int insertSelective(VascularComplication record);

    VascularComplication selectByPrimaryKey(Long vcp_id);

    int updateByPrimaryKeySelective(VascularComplication record);

    int updateByPrimaryKey(VascularComplication record);
}