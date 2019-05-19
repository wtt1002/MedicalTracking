package lab.c505.service.impl;

import lab.c505.entity.FollowSickHistory;
import lab.c505.mapper.FollowSickHistoryMapper;
import lab.c505.service.FollowSickHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

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

    @Autowired
    FollowSickHistoryMapper followSickHistoryMapper;

    @Override
    public FollowSickHistory getFollowSickHistory(String id) throws Exception {
        return followSickHistoryMapper.selectById(id);
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
    public FollowSickHistory addFollowSickHistory(FollowSickHistory followSickHistory) throws Exception {
        if(followSickHistoryMapper.insert
                (followSickHistory.setFollowSickHistoryId(UUID.randomUUID().toString())) == 0){
            throw new Exception("插入FollowSickHistory失败");
        }
        return followSickHistory;
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
    public FollowSickHistory updateFollowSickHistory(FollowSickHistory followSickHistory) throws Exception {
        if(followSickHistoryMapper.updateById(followSickHistory) == 0){
            throw new Exception("更新FollowSickHistory失败");
        }
        return followSickHistory;
    }
}
