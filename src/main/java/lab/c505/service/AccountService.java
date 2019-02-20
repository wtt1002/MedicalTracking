package lab.c505.service;

import lab.c505.entity.Account;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 账户表 服务类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */

public interface AccountService extends IService<Account> {
    Account checkLogin(String loginMobile, String password);
}
