package lab.c505.dao;

import lab.c505.entity.VascularAccessProblem;

public interface VascularAccessProblemMapper {
    int deleteByPrimaryKey(String vascular_access_problem_id);

    int insert(VascularAccessProblem record);

    int insertSelective(VascularAccessProblem record);

    VascularAccessProblem selectByPrimaryKey(String vascular_access_problem_id);

    int updateByPrimaryKeySelective(VascularAccessProblem record);

    int updateByPrimaryKey(VascularAccessProblem record);
}