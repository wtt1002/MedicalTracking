package lab.c505.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lab.c505.entity.Doctor;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.print.Doc;

/**
 * <p>
 * 医生表 服务类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
public interface DoctorService extends IService<Doctor> {
    Doctor getDoctorById(String doctorId);
    String getDocNameById(String doctorId);
    Doctor addOnePatient(Doctor doctor) throws Exception;
    Doctor updateDoctor(Doctor doctor) throws Exception;
    void deleteDoctor(String id) throws Exception;
    IPage<Doctor> getDoctorsByPage(Integer page, Integer count, String filter);
}
