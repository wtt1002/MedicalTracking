package lab.c505.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lab.c505.entity.MedicalHistory;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 患者病史表，记录患者每一次入院信息 服务类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
public interface MedicalHistoryService extends IService<MedicalHistory> {
    String getLastMainDiagnose(String patientId);
    IPage<MedicalHistory> getRecordsByPage(Integer page, Integer count, String patientId);
    String addMedicalHistory(MedicalHistory medicalHistory);
    MedicalHistory getOneMedicalHistory(String medicalHistoryId);
}
