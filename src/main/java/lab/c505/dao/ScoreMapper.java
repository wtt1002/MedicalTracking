package lab.c505.dao;

import lab.c505.entity.Score;

public interface ScoreMapper {
    int deleteByPrimaryKey(String score_id);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(String score_id);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}