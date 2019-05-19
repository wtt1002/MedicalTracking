package lab.c505.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lab.c505.dto.FollowUpTimeDto;
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

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
    public List<FollowUpTimeDto> getFollowUp(String medicalHistoryId, Integer page, Integer count) throws Exception {
        QueryWrapper<FollowUp> fuQueryWrapper = new QueryWrapper<>();
        fuQueryWrapper.eq(true, FollowUp.MEDICAL_HISTORY_ID, medicalHistoryId);
        fuQueryWrapper.orderByAsc(true, FollowUp.FOLLOW_UP_INDEX);
        List<FollowUp> list =  followUpMapper.selectPage(new Page<>(page, count), fuQueryWrapper).getRecords();
        List<FollowUpTimeDto> output = new ArrayList<>();
        for(FollowUp followUp : list){
            output.add(new FollowUpTimeDto(followUp));
        }
        return output;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public FollowUpTimeDto addFollowUp(FollowUpTimeDto followUpTimeDto) throws Exception {
        followUpTimeDto.parseTime();
        if (followUpMapper.insert(followUpTimeDto.getFollowUp().setFollowUpId(UUID.randomUUID().toString())) != 1) {
            throw new Exception("添加失败！");
        }
        return followUpTimeDto;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public FollowUpTimeDto updateFollowUp(FollowUpTimeDto followUpTimeDto) throws Exception {
        followUpTimeDto.parseTime();
        if (followUpMapper.updateById(followUpTimeDto.getFollowUp()) == 0) {
            throw new Exception("修改失败");
        }
        return followUpTimeDto;
    }
}
