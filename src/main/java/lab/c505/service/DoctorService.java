package lab.c505.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lab.c505.entity.Doctor;
import com.baomidou.mybatisplus.extension.service.IService;

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
    void addOnePatient(String name, String dept) throws Exception;
    IPage<Doctor> getDoctorsByPage(Integer page, Integer count, String filter);
}
