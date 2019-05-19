package lab.c505.dto;

import lab.c505.entity.FollowUp;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;

/**
 * @author zxp
 * @since 2019-5-18
 */

@Data
@Accessors(chain = true)
public class FollowUpDetailDto {
    private String patientName;
    private String doctorName;
    private String realTime;
    private FollowUp followUp;
    public FollowUpDetailDto(){}
    public FollowUpDetailDto(String pName, String dName, FollowUp fUp){
        patientName = pName;
        doctorName = dName;
        followUp = fUp;
        LocalDate tmp = followUp.getFinalTime();
        if(tmp != null){
            realTime = followUp.getFinalTime().toString();
        }
    }

    public void parseTime(){
        if(realTime != null && realTime.length() != 0){
            followUp.setFinalTime(LocalDate.parse(realTime));
        }
    }
}
