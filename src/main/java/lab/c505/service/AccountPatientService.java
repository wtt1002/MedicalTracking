package lab.c505.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import lab.c505.entity.AccountPatient;
import lab.c505.entity.Patient;
import org.springframework.stereotype.Service;


public interface AccountPatientService extends IService<AccountPatient> {
    Page<Patient> getPatientsByPage(Page<Patient> page, String accountId, String filter);
    void addOneAccountPatient(AccountPatient accountPatient);
}
