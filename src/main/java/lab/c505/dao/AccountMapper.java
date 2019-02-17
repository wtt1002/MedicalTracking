package lab.c505.dao;

import lab.c505.entity.Account;

public interface AccountMapper {
    int deleteByPrimaryKey(String account_id);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(String account_id);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}