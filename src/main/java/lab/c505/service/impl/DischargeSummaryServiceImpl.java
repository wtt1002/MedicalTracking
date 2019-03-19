package lab.c505.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lab.c505.dto.DischargeExamItem;
import lab.c505.dto.DischargeSummaryDto;
import lab.c505.entity.ExamItem;
import lab.c505.entity.ExamValue;
import lab.c505.entity.Score;
import lab.c505.entity.VascularAccessProblem;
import lab.c505.mapper.ExamItemMapper;
import lab.c505.mapper.ExamValueMapper;
import lab.c505.mapper.ScoreMapper;
import lab.c505.mapper.VascularAccessProblemMapper;
import lab.c505.service.DischargeSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @package: lab.c505.service.impl
 * @description: 出院小结实现类
 * @author: Liu Chenglong
 * @date: 2019-03-19 19:54
 **/
@Service
@Primary
public class DischargeSummaryServiceImpl implements DischargeSummaryService {

    @Autowired
    private ScoreMapper scoreMapper;
    @Autowired
    private VascularAccessProblemMapper vascularAccessProblemMapper;
    @Autowired
    private ExamValueMapper examValueMapper;
    @Autowired
    private ExamItemMapper examItemMapper;

    /**
     * 获取出院小结的信息
     *
     * @param medicalHistoryId
     * @return
     */
    @Override
    public DischargeSummaryDto getDischargeSummary(String medicalHistoryId) throws Exception {
        DischargeSummaryDto dischargeSummaryDto = new DischargeSummaryDto();

        //查询评分
        QueryWrapper<Score> queryWrapperSc = new QueryWrapper<>();
        queryWrapperSc.eq(true, Score.MEDICAL_HISTORY_ID, medicalHistoryId);
        try {

            dischargeSummaryDto.setScore(scoreMapper.selectOne(queryWrapperSc));
        } catch (Exception e) {
            throw new Exception("评分表数据异常!!!");
        }

        //查询血管路入并发症
        QueryWrapper<VascularAccessProblem> queryWrapperVap = new QueryWrapper<>();
        queryWrapperVap.eq(true, VascularAccessProblem.MEDICAL_HISTORY_ID, medicalHistoryId);
        try {
            dischargeSummaryDto.setVascularAccessProblem(vascularAccessProblemMapper.selectOne(queryWrapperVap));
        } catch (Exception e) {
            throw new Exception("血管路入并发症表数据异常!!!");
        }

        QueryWrapper<ExamValue> queryWrapperEv = new QueryWrapper<>();
        queryWrapperEv.eq(true, ExamValue.MEDICAL_HISTORY_ID, medicalHistoryId);
        List<ExamValue> examValues = examValueMapper.selectList(queryWrapperEv);
        if (examValues != null && !examValues.isEmpty()) {
            //时间
            dischargeSummaryDto.setExamTime(examValues.get(0).getExamTime().toString());

            //PCI术后检查
            List<DischargeExamItem> dischargeExamItems = new ArrayList<>();
            for (ExamValue examValue:examValues) {
                ExamItem examItem = examItemMapper.selectById(examValue.getExamItemId());
                DischargeExamItem dischargeExamItem = new DischargeExamItem();
                dischargeExamItem.setExamValue(examValue.getExamValue().toString());
                dischargeExamItem.setExamItemName(examItem.getExamItemName());
                dischargeExamItem.setShortName(examItem.getShortName());
                dischargeExamItems.add(dischargeExamItem);
            }
            dischargeSummaryDto.setDischargeExamItems(dischargeExamItems);
        }

        return dischargeSummaryDto;
    }
}
