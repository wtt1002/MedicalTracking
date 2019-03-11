package lab.c505.dto;

import lab.c505.entity.ExamItem;
import lab.c505.entity.ExamValue;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;

@Data
@Accessors(chain = true)
public class MyExamDto {
    private ExamItem examItem;
    private ExamValue examValue;
    private String examTime;

    public MyExamDto(){

    }
    public MyExamDto(ExamItem examItem, ExamValue examValue){
        this.examItem = examItem;
        this.examValue = examValue;
        examTime = examValue.getExamTime().toString();
    }
    public MyExamDto parseTime(){
       examValue.setExamTime(LocalDate.parse(examTime));
       return this;
    }
}
