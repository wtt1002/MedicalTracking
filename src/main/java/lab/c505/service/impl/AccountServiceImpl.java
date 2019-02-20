package lab.c505.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lab.c505.entity.Account;
import lab.c505.mapper.AccountMapper;
import lab.c505.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 账户表 服务实现类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Service
@Primary
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Override
    public Account checkLogin(String loginMobile, String password) {
        QueryWrapper<Account> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(Account.LOGIN_MOBILE, loginMobile)
                .eq(Account.LOGIN_PASSWORD, password);
        Account account = accountMapper.selectOne(queryWrapper);

        return account;
    }
}
