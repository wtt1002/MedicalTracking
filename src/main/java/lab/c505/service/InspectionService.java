package lab.c505.service;

import lab.c505.dto.InspectionTimeDto;

import java.util.List;

/**
 * 医学图像检查结论
 * @author zxp
 * @date 2019-5-31
 */


public interface InspectionService {
    List<InspectionTimeDto> getInspections(String meidicalId, int examIndex) throws Exception;
    InspectionTimeDto addInspection(InspectionTimeDto inspectionTimeDto) throws Exception;
    InspectionTimeDto updateInspection(InspectionTimeDto inspectionTimeDto) throws Exception;
}
