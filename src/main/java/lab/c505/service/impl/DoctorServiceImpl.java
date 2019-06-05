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

import java.util.List;

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

    @Override
    @Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
    public Doctor addOnePatient(Doctor doctor) throws Exception {
        if(doctorMapper.insert(doctor.setDoctorId(null)) == 0){
            throw new Exception("插入医生失败");
        }
        return doctor;
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
    public Doctor updateDoctor(Doctor doctor) throws Exception {
        if(doctorMapper.updateById(doctor) == 0){
            throw new Exception("更新医生失败");
        }
        return doctor;
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
    public void deleteDoctor(String id) throws Exception {
        if(doctorMapper.deleteById(id) == 0){
            throw new Exception("删除医生失败，可能是外键依赖所致");
        }
    }

    @Override
    public IPage<Doctor> getDoctorsByPage(Integer page, Integer count, String filter) {
        QueryWrapper<Doctor> queryWrapper = new QueryWrapper<>();
        queryWrapper.like(Doctor.DOCTOR_NAME,filter);
        return doctorMapper.selectPage(new Page<>(page ,count), queryWrapper);

    }

    @Override
    public List<Doctor> getDoctors() {
        return doctorMapper.selectList(null);
    }


}
