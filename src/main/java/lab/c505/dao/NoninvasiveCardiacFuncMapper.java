package lab.c505.dao;

import lab.c505.entity.NoninvasiveCardiacFunc;

public interface NoninvasiveCardiacFuncMapper {
    int deleteByPrimaryKey(Long ncf_id);

    int insert(NoninvasiveCardiacFunc record);

    int insertSelective(NoninvasiveCardiacFunc record);

    NoninvasiveCardiacFunc selectByPrimaryKey(Long ncf_id);

    int updateByPrimaryKeySelective(NoninvasiveCardiacFunc record);

    int updateByPrimaryKey(NoninvasiveCardiacFunc record);
}