package lab.c505.dto;

import lab.c505.entity.Score;
import lab.c505.entity.VascularAccessProblem;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @package: lab.c505.dto
 * @description: 评分和血管路入并发症Dto
 * @author: Liu Chenglong
 * @date: 2019-03-20 10:56
 **/
@Data
@Accessors(chain = true)
public class ScoreAndVapDto {
    private Score score;
    private VascularAccessProblem vascularAccessProblem;
}
