package lab.c505.service.impl;

import lab.c505.entity.FollowUp;
import lab.c505.mapper.FollowUpMapper;
import lab.c505.service.FollowUpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 随访表，记录随访的计划与实际时间，随访患者与医生等信息 服务实现类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Service
public class FollowUpServiceImpl extends ServiceImpl<FollowUpMapper, FollowUp> implements FollowUpService {

}
