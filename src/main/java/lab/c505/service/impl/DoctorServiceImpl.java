package lab.c505.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lab.c505.entity.Doctor;
import lab.c505.mapper.DoctorMapper;
import lab.c505.service.DoctorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 医生表 服务实现类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Service
@Primary
public class DoctorServiceImpl extends ServiceImpl<DoctorMapper, Doctor> implements DoctorService {

    @Autowired
    DoctorMapper doctorMapper;

    @Override
    public Doctor getDoctorById(String doctorId) {
        return doctorMapper.selectById(doctorId);
    }

    @Override
    public String getDocNameById(String doctorId) {
        Doctor doctor = doctorMapper.selectById(doctorId);
        return doctor.getDoctorName();
    }

    @Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
    public void insetPatient(Doctor doctor) throws Exception{
        if(doctorMapper.insert(doctor) == 0){
            throw new Exception("插入医生失败");
        }
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
    public void addOnePatient(String name, String dept) throws Exception {
        Doctor doctor = new Doctor();
        doctor.setDoctorName(name).setDeptId(dept);
        insetPatient(doctor);
    }

    @Override
    public IPage<Doctor> getDoctorsByPage(Integer page, Integer count, String filter) {
        QueryWrapper<Doctor> queryWrapper = new QueryWrapper<>();
        queryWrapper.like(Doctor.DOCTOR_NAME,filter);
        IPage<Doctor> ipage = doctorMapper.selectPage(new Page<Doctor>(page ,count), queryWrapper);
        return ipage;
    }


}
