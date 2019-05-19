package lab.c505.service;

import lab.c505.entity.FollowSickHistory;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 随访病史表，从出院到此次随访为止，出现的所有病史 服务类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
public interface FollowSickHistoryService extends IService<FollowSickHistory> {
    FollowSickHistory getFollowSickHistory(String id) throws Exception;
    FollowSickHistory addFollowSickHistory(FollowSickHistory followSickHistory) throws Exception;
    FollowSickHistory updateFollowSickHistory(FollowSickHistory followSickHistory) throws Exception;
}
