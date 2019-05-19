package lab.c505.dto;

import lab.c505.entity.ExamCategory;
import lab.c505.entity.ExamItem;
import lab.c505.entity.ExamValue;
import lab.c505.entity.InspectionConclusion;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
public class MedicalHistoryExamDto {
    private String examCategoryCode;

    private String examCategoryName;

    private List<MyExamDto> listMyExamDto;

    private InspectionConclusion inspectionConclusion;

    public MedicalHistoryExamDto(){

    }
    public MedicalHistoryExamDto(ExamCategory examCategory, ExamItem examItem, ExamValue examValue){
        if(examCategory != null){
            this.examCategoryCode = examCategory.getExamCategoryCode();
            this.examCategoryName = examCategory.getExamCategoryName();
        }

        listMyExamDto = new ArrayList<>();
        listMyExamDto.add(new MyExamDto(examItem, examValue));
    }
}
