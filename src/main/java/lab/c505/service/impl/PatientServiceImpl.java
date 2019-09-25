package lab.c505.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lab.c505.entity.Patient;
import lab.c505.mapper.PatientMapper;
import lab.c505.service.PatientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * 患者信息表 服务实现类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Service
@Primary
public class PatientServiceImpl extends ServiceImpl<PatientMapper, Patient> implements PatientService {

    @Autowired
    PatientMapper patientMapper;
    @Override
    public IPage<Patient> getPatientsByPage(String accountId, Integer page, Integer count, String filter) {

        QueryWrapper<Patient> queryWrapper = new QueryWrapper<>();
        queryWrapper.like(Patient.NAME, filter);
        IPage<Patient> ipage = patientMapper.selectPage(new Page<Patient>(page ,count), queryWrapper);
//        System.out.println("Page111 " + ipage.getCurrent());
//        System.out.println("count " + ipage.getSize());
//        System.out.println("totalCount : " + ipage.getTotal());
        return ipage;
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
    public void addOnePatient(Patient patient){
        patientMapper.insert(patient);
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
    public void uptOnePatient(Patient patient){
        patientMapper.updateById(patient);
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
    public void removeOnePatient(String patientId) {
        patientMapper.deleteById(patientId);
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
    public void batchRemovePatient(List<String> ids) {
        patientMapper.deleteBatchIds(ids);
    }
}
