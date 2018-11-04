package lab.c505.dao;

import lab.c505.entity.AdverseReaction;

public interface AdverseReactionMapper {
    int deleteByPrimaryKey(Long ar_id);

    int insert(AdverseReaction record);

    int insertSelective(AdverseReaction record);

    AdverseReaction selectByPrimaryKey(Long ar_id);

    int updateByPrimaryKeySelective(AdverseReaction record);

    int updateByPrimaryKey(AdverseReaction record);
}