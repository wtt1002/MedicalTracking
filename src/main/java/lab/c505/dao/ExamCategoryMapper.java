package lab.c505.dao;

import lab.c505.entity.ExamCategory;

public interface ExamCategoryMapper {
    int deleteByPrimaryKey(String exam_category_id);

    int insert(ExamCategory record);

    int insertSelective(ExamCategory record);

    ExamCategory selectByPrimaryKey(String exam_category_id);

    int updateByPrimaryKeySelective(ExamCategory record);

    int updateByPrimaryKey(ExamCategory record);
}