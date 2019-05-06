package lab.c505.service;

import lab.c505.entity.FollowPhysicalExam;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 随访体检表 服务类
 * </p>
 *
 * @author Liu Chenglong
 * @since 2019-05-06
 */
public interface FollowPhysicalExamService extends IService<FollowPhysicalExam> {

    FollowPhysicalExam getFollowPhysicalExam(String followUpId) throws Exception;

    FollowPhysicalExam addFollowPhysicalExam(FollowPhysicalExam followPhysicalExam) throws Exception;

    FollowPhysicalExam updateFollowPhysicalExam(FollowPhysicalExam followPhysicalExam) throws Exception;
}
