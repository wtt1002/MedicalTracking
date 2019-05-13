package lab.c505.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lab.c505.dto.*;
import lab.c505.entity.ExamValue;
import lab.c505.entity.MedicalHistory;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

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

    List<MedicalHistoryExamDto> queryMedicalHistory(String medicalHistoryId) throws Exception;
    List<MyExamDto> insertMedicalExam(List<AddMedicalExamDto> addMedicalExamDtos) throws Exception;

    List<MyExamDto> updateMedicalExam(List<AddMedicalExamDto> addMedicalExamDtos) throws Exception;

    List<MedicalHistoryExamDto> queryMedicalHistoryWithConclusion(String medicalHistoryId,int examIndex) throws Exception;

    //MedicalHistoryExamDto updateMedicalHistoryExamWithConclusion(List<AddMedicalExamDto> dtos, String conclusion) throws Exception;

    MyExamWithConclusionDto insertExamWithConclusion(AddMedicalExamWithConclusionDto addMedicalExamWithConclusionDto) throws Exception;
    MyExamWithConclusionDto updateExamWithConclusion(AddMedicalExamWithConclusionDto addMedicalExamWithConclusionDto) throws Exception;
}
