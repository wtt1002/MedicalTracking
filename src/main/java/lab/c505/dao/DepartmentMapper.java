package lab.c505.dao;

import lab.c505.entity.Department;

public interface DepartmentMapper {
    int deleteByPrimaryKey(String dept_id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(String dept_id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}