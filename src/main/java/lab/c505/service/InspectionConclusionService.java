package lab.c505.service;

import lab.c505.entity.InspectionConclusion;
import com.baomidou.mybatisplus.extension.service.IService;
import lab.c505.entity.MedicalHistory;

/**
 * <p>
 * 检查结论表 服务类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
public interface InspectionConclusionService extends IService<InspectionConclusion> {
    InspectionConclusion getOneConclusion(String medicalHistoryId, int examIndex, String examCategory);
}
