package lab.c505.dao;

import lab.c505.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long user_id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long user_id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}