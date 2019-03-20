package lab.c505.service;

import lab.c505.dto.DischargeExamItemDto;
import lab.c505.dto.DischargeSummaryDto;
import lab.c505.dto.ScoreAndVapDto;

import java.util.List;

public interface DischargeSummaryService {
    DischargeSummaryDto getDischargeSummary(String medicalHistoryId) throws Exception;
    List<DischargeExamItemDto> addDischargeExamItems(List<DischargeExamItemDto> dischargeExamItemDtos) throws Exception;
    ScoreAndVapDto addScoreAndVap(ScoreAndVapDto scoreAndVapDto) throws Exception;
    List<DischargeExamItemDto> updateDischargeExamItems(List<DischargeExamItemDto> dischargeExamItemDtos) throws Exception;
    ScoreAndVapDto updateScoreAndVap(ScoreAndVapDto scoreAndVapDto) throws Exception;
}
