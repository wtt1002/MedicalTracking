package lab.c505.dto;

import lab.c505.entity.MedicalHistory;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;

/**
 * Package: lab.c505.dto
 * Description： TODO
 * Author: TingTing W
 * Date: Created in 2019/3/6 19:36
 */
@Data
@Accessors(chain = true)
public class MedicalHistoryDto {
    private MedicalHistory medicalHistory;
    private String inTimeStr;
    private String outTimeStr;

    public MedicalHistoryDto formatTime(){
        if (inTimeStr != null && inTimeStr.length() != 0){
            medicalHistory.setInTime(LocalDate.parse(inTimeStr));
        }
        if (outTimeStr != null && outTimeStr.length() != 0){
            medicalHistory.setOutTime(LocalDate.parse(outTimeStr));
        }
        return this;
    }

    public MedicalHistoryDto stringTime(){
        if (medicalHistory.getInTime() != null){
            inTimeStr = medicalHistory.getInTime().toString();
        }
        if (medicalHistory.getOutTime() != null){
            outTimeStr = medicalHistory.getOutTime().toString();
        }
        return this;
    }
}
