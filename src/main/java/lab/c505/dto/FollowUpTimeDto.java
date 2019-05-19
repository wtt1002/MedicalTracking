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
public class FollowUpTimeDto {
    private String planTime;
    private String finalTime;
    private FollowUp followUp;

    public FollowUpTimeDto(){}
    public FollowUpTimeDto(FollowUp followUp){
        this.followUp = followUp;
        if(followUp != null && followUp.getPlanTime() != null){
            planTime = followUp.getPlanTime().toString();
        }
        if(followUp != null && followUp.getFinalTime() != null){
            finalTime = followUp.getFinalTime().toString();
        }
    }

    public void parseTime(){
        if(planTime != null && planTime.length() != 0){
            followUp.setPlanTime(LocalDate.parse(planTime));
        }
        if(finalTime != null && finalTime.length() != 0){
            followUp.setFinalTime(LocalDate.parse(finalTime));
        }
    }
}
