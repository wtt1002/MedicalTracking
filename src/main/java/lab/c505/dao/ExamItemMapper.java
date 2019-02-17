package lab.c505.dao;

import lab.c505.entity.ExamItem;

public interface ExamItemMapper {
    int deleteByPrimaryKey(String exam_item_id);

    int insert(ExamItem record);

    int insertSelective(ExamItem record);

    ExamItem selectByPrimaryKey(String exam_item_id);

    int updateByPrimaryKeySelective(ExamItem record);

    int updateByPrimaryKey(ExamItem record);
}