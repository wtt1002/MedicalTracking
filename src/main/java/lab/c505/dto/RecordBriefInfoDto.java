package lab.c505.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Package: lab.c505.dto
 * Description： 患者病历dto
 * Author: TingTing W
 * Date: Created in 2019/3/5 11:01
 */
@Data
@Accessors(chain = true)
public class RecordBriefInfoDto {
    private Integer medicalHistoryId;
    private String inTime;
    private String outTime;
    private String operateDoc;
    private String mainDiagnose;
    private String riskFactor;
    private Long total;
}
