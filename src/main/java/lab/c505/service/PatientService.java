package lab.c505.service;

import lab.c505.entity.Patient;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 患者信息表 服务类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
public interface PatientService extends IService<Patient> {
    List<Patient> getPatientsByPage(Integer page, Integer count, String filter);
}
