package lab.c505.dto;

import lab.c505.entity.BodyComposition;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Package: lab.c505.dto
 * Description： TODO
 * Author: TingTing W
 * Date: Created in 2019/5/4 16:50
 */
@Data
@Accessors(chain = true)
public class AdmissionCheckDto {
    private List<MedicalHistoryExamDto> medicalHistoryExamDtos;
    private BodyComposition bodyComposition;
}
