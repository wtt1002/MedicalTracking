package lab.c505.service.impl;

import lab.c505.entity.FollowSickHistory;
import lab.c505.mapper.FollowSickHistoryMapper;
import lab.c505.service.FollowSickHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 随访病史表，从出院到此次随访为止，出现的所有病史 服务实现类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Service
public class FollowSickHistoryServiceImpl extends ServiceImpl<FollowSickHistoryMapper, FollowSickHistory> implements FollowSickHistoryService {

}
