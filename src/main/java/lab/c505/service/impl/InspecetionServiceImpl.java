package lab.c505.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lab.c505.dto.InspectionTimeDto;
import lab.c505.entity.InspectionConclusion;
import lab.c505.mapper.InspectionConclusionMapper;
import lab.c505.service.InspectionConclusionService;
import lab.c505.service.InspectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 医学图像检查结论
 * @author zxp
 * @date 2019-5-31
 */
@Service
@Primary
public class InspecetionServiceImpl implements InspectionService {

    @Autowired
    private InspectionConclusionMapper inspectionConclusionMapper;

    @Autowired
    private InspectionConclusionService inspectionConclusionService;

    @Override
    public List<InspectionTimeDto> getInspections(String meidicalId, int examIndex) throws Exception {
        QueryWrapper<InspectionConclusion> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(InspectionConclusion.MEDICAL_HISTORY_ID, meidicalId)
                .eq(InspectionConclusion.EXAM_INDEX, examIndex)
                .in(InspectionConclusion.EXAM_CATEGORY, Arrays.asList("9", "11", "12"));
        List<InspectionTimeDto> output = new ArrayList<>();
        List<InspectionConclusion> list =  inspectionConclusionMapper.selectList(queryWrapper);
        for(InspectionConclusion inspectionConclusion : list){
            output.add(new InspectionTimeDto(inspectionConclusion));
        }
        return output;
    }

    @Override
    public InspectionTimeDto addInspection(InspectionTimeDto inspectionTimeDto) throws Exception {
        inspectionTimeDto.parseTime();
        inspectionConclusionService.insertConclusion(inspectionTimeDto.getInspectionConclusion());
        return inspectionTimeDto;
    }

    @Override
    public InspectionTimeDto updateInspection(InspectionTimeDto inspectionTimeDto) throws Exception {
        inspectionTimeDto.parseTime();
        inspectionConclusionService.updateConclusion(inspectionTimeDto.getInspectionConclusion());
        return inspectionTimeDto;
    }
}
