package lab.c505.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lab.c505.dto.DischargeExamItemDto;
import lab.c505.dto.DischargeSummaryDto;
import lab.c505.dto.ScoreAndVapDto;
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
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
            List<DischargeExamItemDto> dischargeExamItemDtos = new ArrayList<>();
            for (ExamValue examValue : examValues) {
                ExamItem examItem = examItemMapper.selectById(examValue.getExamItemId());
                DischargeExamItemDto dischargeExamItemDto = new DischargeExamItemDto();
                dischargeExamItemDto.setExamValue(examValue.getExamValue());
                dischargeExamItemDto.setExamItemName(examItem.getExamItemName());
                dischargeExamItemDto.setShortName(examItem.getShortName());
                dischargeExamItemDto.setExamIndex(examValue.getExamIndex());
                dischargeExamItemDtos.add(dischargeExamItemDto);
            }
            dischargeSummaryDto.setDischargeExamItemDtos(dischargeExamItemDtos);
        }

        return dischargeSummaryDto;
    }

    /**
     * 添加出院小结PCI术后检查
     *
     * @param dischargeExamItemDtos
     * @return
     * @throws Exception
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public List<DischargeExamItemDto> addDischargeExamItems(List<DischargeExamItemDto> dischargeExamItemDtos) throws Exception {
        for (DischargeExamItemDto dischargeExamItemDto : dischargeExamItemDtos) {
            ExamValue examValue = new ExamValue();
            examValue.setExamTime(LocalDate.parse(dischargeExamItemDto.getExamTime(), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            examValue.setExamValue(dischargeExamItemDto.getExamValue());
            examValue.setExamIndex(dischargeExamItemDto.getExamIndex());
            examValue.setMedicalHistoryId(dischargeExamItemDto.getMedicalHistoryId());
            examValue.setExamItemId(getExamItemIdByCode(dischargeExamItemDto.getExamItemCode()));
            insertExamValue(examValue);
        }
        return dischargeExamItemDtos;
    }

    public String getExamItemIdByCode(String examItemCode) throws Exception {
        QueryWrapper<ExamItem> queryWrapperEi = new QueryWrapper<>();
        queryWrapperEi.eq(true, ExamItem.EXAM_ITEM_CODE, examItemCode);
        ExamItem examItem = examItemMapper.selectOne(queryWrapperEi);
        if (examItem != null && examItem.getExamCategoryId() != null) {
            return examItem.getExamCategoryId();
        }
        throw new Exception("数据写入出错!!!");
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public ExamValue insertExamValue(ExamValue examValue) throws Exception {
        if (examValueMapper.insert(examValue) != 1) {
            throw new Exception("添加PCI术后检查单项值出错！");
        }
        return examValue;
    }

    /**
     * 添加评分和血管路入并发症
     *
     * @param scoreAndVapDto
     * @return
     * @throws Exception
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public ScoreAndVapDto addScoreAndVap(ScoreAndVapDto scoreAndVapDto) throws Exception {
        scoreAndVapDto.setScore(insertScore(scoreAndVapDto.getScore()));
        scoreAndVapDto.setVascularAccessProblem(insertVascularAccessProblem(scoreAndVapDto.getVascularAccessProblem()));
        return scoreAndVapDto;
    }

    /**
     * 修改出院小结PCI术后检查
     *
     * @param dischargeExamItemDtos
     * @return
     * @throws Exception
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public List<DischargeExamItemDto> updateDischargeExamItems(List<DischargeExamItemDto> dischargeExamItemDtos) throws Exception {
        for (DischargeExamItemDto dischargeExamItemDto : dischargeExamItemDtos) {
            ExamValue examValue = new ExamValue();
            examValue.setExamValueId(dischargeExamItemDto.getExamValueId());
            examValue.setExamIndex(dischargeExamItemDto.getExamIndex());
            examValue.setExamTime(LocalDate.parse(dischargeExamItemDto.getExamTime(), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            examValue.setExamValue(dischargeExamItemDto.getExamValue());
            examValue.setMedicalHistoryId(dischargeExamItemDto.getMedicalHistoryId());
            examValue.setExamItemId(getExamItemIdByCode(dischargeExamItemDto.getExamItemCode()));
            updateExamValue(examValue);
        }
        return dischargeExamItemDtos;
    }

    /**
     * 修改评分和血管路入并发症
     *
     * @param scoreAndVapDto
     * @return
     * @throws Exception
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public ScoreAndVapDto updateScoreAndVap(ScoreAndVapDto scoreAndVapDto) throws Exception {
        scoreAndVapDto.setScore(updateScore(scoreAndVapDto.getScore()));
        scoreAndVapDto.setVascularAccessProblem(updateVascularAccessProblem(scoreAndVapDto.getVascularAccessProblem()));
        return scoreAndVapDto;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Score updateScore(Score score) throws Exception {
        if (scoreMapper.updateById(score) == 0) {
            throw new Exception("修改失败");
        }
        return score;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public VascularAccessProblem updateVascularAccessProblem(VascularAccessProblem vascularAccessProblem) throws Exception {
        if (vascularAccessProblemMapper.updateById(vascularAccessProblem) == 0) {
            throw new Exception("修改失败");
        }
        return vascularAccessProblem;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public ExamValue updateExamValue(ExamValue examValue) throws Exception {
        if (examValueMapper.updateById(examValue) == 0) {
            throw new Exception("修改失败");
        }
        return examValue;
    }


    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Score insertScore(Score score) throws Exception {
        if (scoreMapper.insert(score) != 1) {
            throw new Exception("评分表添加出错！");
        }
        return score;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public VascularAccessProblem insertVascularAccessProblem(VascularAccessProblem vascularAccessProblem) throws Exception {
        if (vascularAccessProblemMapper.insert(vascularAccessProblem) != 1) {
            throw new Exception("血管路入并发症添加出错！");
        }
        return vascularAccessProblem;
    }
}
