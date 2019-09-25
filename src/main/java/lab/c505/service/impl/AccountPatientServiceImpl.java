package lab.c505.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lab.c505.entity.AccountPatient;
import lab.c505.entity.Patient;
import lab.c505.mapper.AccountPatientMapper;
import lab.c505.service.AccountPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountPatientServiceImpl extends ServiceImpl<AccountPatientMapper, AccountPatient> implements AccountPatientService {

    @Autowired
    AccountPatientMapper accountPatientMapper;
    @Override
    public Page<Patient> getPatientsByPage(Page<Patient> page, String accountId, String filter) {
        return page.setRecords(this.baseMapper.getPatientByAccountId(page, accountId, filter));
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
    public void addOneAccountPatient(AccountPatient accountPatient){
        accountPatientMapper.insert(accountPatient);
    }
}
