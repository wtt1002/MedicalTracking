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
    private String inTime;
    private String outTime;
    private String operate_doc;
    private String main_diagnose;
    private Long total;
}
