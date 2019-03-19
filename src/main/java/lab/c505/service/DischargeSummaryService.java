package lab.c505.service;

import lab.c505.dto.DischargeSummaryDto;

public interface DischargeSummaryService {
    DischargeSummaryDto getDischargeSummary(String medicalHistoryId) throws Exception;
}
