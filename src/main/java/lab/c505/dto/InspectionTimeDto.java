package lab.c505.dto;

import lab.c505.entity.InspectionConclusion;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;

@Data
@Accessors(chain = true)
public class InspectionTimeDto {
    private InspectionConclusion inspectionConclusion;
    private String time;

    public InspectionTimeDto(){}
    public InspectionTimeDto(InspectionConclusion i){
        inspectionConclusion = i;
        if(i != null && i.getExamTime() != null)
            time = i.getExamTime().toString();
    }

    public void parseTime(){
        if(time != null && time.length() != 0)
            inspectionConclusion.setExamTime(LocalDate.parse(time));
    }
}
