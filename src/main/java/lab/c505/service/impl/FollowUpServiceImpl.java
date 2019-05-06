package lab.c505.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lab.c505.entity.FollowUp;
import lab.c505.entity.MedicalHistory;
import lab.c505.mapper.FollowUpMapper;
import lab.c505.service.FollowUpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * 随访表，记录随访的计划与实际时间，随访患者与医生等信息 服务实现类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Service
@Primary
public class FollowUpServiceImpl extends ServiceImpl<FollowUpMapper, FollowUp> implements FollowUpService {

    @Autowired
    private FollowUpMapper followUpMapper;

    @Override
    public List<FollowUp> getFollowUp(String medicalHistoryId, Integer page, Integer count) throws Exception {
        QueryWrapper<FollowUp> fuQueryWrapper = new QueryWrapper<>();
        fuQueryWrapper.eq(true, FollowUp.MEDICAL_HISTORY_ID, medicalHistoryId);
        fuQueryWrapper.orderByAsc(true, FollowUp.FOLLOW_UP_INDEX);
        return followUpMapper.selectPage(new Page<>(page, count), fuQueryWrapper).getRecords();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public FollowUp addFollowUp(FollowUp followUp) throws Exception {
        if (followUpMapper.insert(followUp) != 1) {
            throw new Exception("添加失败！");
        }
        return followUp;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public FollowUp updateFollowUp(FollowUp followUp) throws Exception {
        if (followUpMapper.updateById(followUp) == 0) {
            throw new Exception("修改失败");
        }
        return followUp;
    }
}
