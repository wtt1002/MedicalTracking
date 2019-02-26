package lab.c505.service.impl;

import lab.c505.entity.Doctor;
import lab.c505.mapper.DoctorMapper;
import lab.c505.service.DoctorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

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
}
