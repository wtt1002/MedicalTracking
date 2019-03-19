package lab.c505.dto;

import lab.c505.entity.Score;
import lab.c505.entity.VascularAccessProblem;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @package: lab.c505.dto
 * @description: 出院小结
 * @author: Liu Chenglong
 * @date: 2019-03-19 19:22
 **/
@Data
@Accessors(chain = true)
public class DischargeSummaryDto {
    private Score score;
    private VascularAccessProblem vascularAccessProblem;
    private String examTime;
    private List<DischargeExamItem> dischargeExamItems;
}
