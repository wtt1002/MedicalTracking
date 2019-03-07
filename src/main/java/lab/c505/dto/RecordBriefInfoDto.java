package lab.c505.dto;

import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;

/**
 * Package: lab.c505.dto
 * Description： 患者病历dto
 * Author: TingTing W
 * Date: Created in 2019/3/5 11:01
 */
@Data
@Accessors(chain = true)
public class RecordBriefInfoDto {
    private String medicalHistoryId;
    private String inTime;
    private String outTime;
    private String operateDoc;
    private String mainDiagnose;
    private String riskFactor;
    private Long total;

    public void setMainDiagnose(String diagnose ){
        System.out.println(diagnose);
//        diagnose.replace("[","");
//        diagnose.replace("]","");
//        diagnose.replace("\"","");
        this.mainDiagnose = diagnose;
    }

    public void setInTime(LocalDate inTime) {
        if(inTime != null){
            this.inTime = inTime.toString();
        }else {
            this.inTime = "";
        }
    }

    public void setOutTime(LocalDate outTime) {
        if (outTime != null){
            this.outTime = outTime.toString();
        }else {
            this.outTime = "";
        }
    }
}
