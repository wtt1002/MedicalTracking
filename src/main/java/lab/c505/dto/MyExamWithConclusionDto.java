package lab.c505.dto;

import lab.c505.entity.InspectionConclusion;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Package: lab.c505.dto
 * Description： TODO
 * Author: TingTing W
 * Date: Created in 2019/5/13 9:43
 */
@Data
@Accessors(chain = true)
public class MyExamWithConclusionDto {
    List<MyExamDto> myExamDtos;
    InspectionConclusion inspectionConclusion;
}
