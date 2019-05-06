package lab.c505.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lab.c505.entity.InspectionConclusion;
import lab.c505.mapper.InspectionConclusionMapper;
import lab.c505.service.InspectionConclusionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 检查结论表 服务实现类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Service
public class InspectionConclusionServiceImpl extends ServiceImpl<InspectionConclusionMapper, InspectionConclusion> implements InspectionConclusionService {

    @Autowired
    InspectionConclusionMapper inspectionConclusionMapper;

    @Override
    public InspectionConclusion getOneConclusion(String medicalHistoryId, int examIndex, String examCategory) {

        QueryWrapper<InspectionConclusion> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(InspectionConclusion.MEDICAL_HISTORY_ID,medicalHistoryId)
                .eq(InspectionConclusion.EXAM_INDEX,examIndex)
                .eq(InspectionConclusion.EXAM_CATEGORY,examCategory);
        return inspectionConclusionMapper.selectOne(queryWrapper);
    }
}
