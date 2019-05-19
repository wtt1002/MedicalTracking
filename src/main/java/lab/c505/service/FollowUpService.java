package lab.c505.service;

import lab.c505.dto.FollowUpTimeDto;
import lab.c505.entity.FollowUp;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 随访表，记录随访的计划与实际时间，随访患者与医生等信息 服务类
 * </p>
 *
 * @author Liu Chenglong
 * @since 2019-05-06
 */
public interface FollowUpService extends IService<FollowUp> {

    List<FollowUpTimeDto> getFollowUp(String medicalHistoryId, Integer page, Integer count) throws Exception;

    FollowUpTimeDto addFollowUp(FollowUpTimeDto followUpTimeDto) throws Exception;

    FollowUpTimeDto updateFollowUp(FollowUpTimeDto followUpTimeDto) throws Exception;
}
