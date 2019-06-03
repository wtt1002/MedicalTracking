package lab.c505.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lab.c505.dto.AccountInfoDto;
import lab.c505.entity.Account;
import lab.c505.entity.Doctor;
import lab.c505.mapper.AccountMapper;
import lab.c505.service.AccountService;
import lab.c505.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

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
    private AccountMapper accountMapper;

    @Autowired
    private DoctorService doctorService;

    @Override
    public Account checkLogin(String loginMobile, String password) {
        QueryWrapper<Account> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(Account.LOGIN_MOBILE, loginMobile)
                .eq(Account.LOGIN_PASSWORD, password);
        Account account = accountMapper.selectOne(queryWrapper);

        return account;
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
    public AccountInfoDto updateAccount(Account account) throws Exception {
        if(accountMapper.updateById(account) == 0){
            throw new Exception("更新失败");
        }
        Doctor doctor = doctorService.getDoctorById(account.getDoctorId());
        return new AccountInfoDto(account, doctor);


    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
    public AccountInfoDto addAccount(Account account) throws Exception {
        QueryWrapper<Account> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(Account.LOGIN_MOBILE, account.getLoginMobile());
        if(accountMapper.selectOne(queryWrapper) != null){
            throw new Exception("号码已存在");
        }
        if(accountMapper.insert(account.setAccountId(null)) == 0){
            throw new Exception("插入失败");
        }
        Doctor doctor = doctorService.getDoctorById(account.getDoctorId());
        return new AccountInfoDto(account, doctor);
    }

    @Override
    public List<AccountInfoDto> queryAccounts(int page, int count, String phoneNumber) throws Exception {
        QueryWrapper<Account> queryWrapper = new QueryWrapper<>();
        queryWrapper.like(Account.LOGIN_MOBILE, phoneNumber);
        List<Account> list = accountMapper.selectPage(new Page<>(page, count), queryWrapper).getRecords();
        List<AccountInfoDto> output = new ArrayList<>();
        for(Account account : list)
        {
            output.add(new AccountInfoDto(account,
                    doctorService.getDoctorById(account.getDoctorId())));
        }
        return output;
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
    public void deleteAccount(String id) throws Exception {
        if(accountMapper.deleteById(id) == 0){
            throw new Exception("删除失败");
        }
    }
}
