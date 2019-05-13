package lab.c505.dto;

import org.springframework.beans.BeanUtils;
import lab.c505.entity.ExamValue;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Accessors(chain = true)
public class AddMedicalExamDto {

    private String examItemId;

    /*
    插入的时候无需填该ID
     */
    private String examValueId;

    private String medicalHistoryId;

    private BigDecimal examValue;

    private LocalDate examTime;

    private Integer examIndex;


    private String examItemCode;
    private String myExamTime;

    public ExamValue toExamValue() throws Exception{
        if(myExamTime.equals("")){
            throw new Exception("ExamTime is null");
        }
        examTime = LocalDate.parse(myExamTime);
        ExamValue examValue = new ExamValue();
        BeanUtils.copyProperties(this, examValue);
        return examValue;
    }
}
