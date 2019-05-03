package lab.c505.service;

import lab.c505.entity.Assessment;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 入院评估表 服务类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
public interface AssessmentService extends IService<Assessment> {

    List<Assessment> getOneAssessment(String medicalHistoryId);
    String addOneAssessment(Assessment assessment) throws Exception;
    Assessment updateOneAssessment(Assessment assessment) throws Exception;

}
