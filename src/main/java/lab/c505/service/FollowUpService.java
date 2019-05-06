package lab.c505.service;

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

    List<FollowUp> getFollowUp(String medicalHistoryId, Integer page, Integer count) throws Exception;

    FollowUp addFollowUp(FollowUp followUp) throws Exception;

    FollowUp updateFollowUp(FollowUp followUp) throws Exception;
}
