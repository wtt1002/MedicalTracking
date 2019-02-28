package lab.c505.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
    public List<Patient> getPatientsByPage(Integer page, Integer count, String filter) {
        QueryWrapper<Patient> queryWrapper = new QueryWrapper<>();
        int a = page, b = count;
        queryWrapper.like(Patient.NAME, filter);
        List<Patient> list = patientMapper.selectPage(new Page<>(a, b), queryWrapper).getRecords();
        return list;
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
    public void addOnePatient(Patient patient) throws Exception {
        patientMapper.insert(patient);
    }
}
