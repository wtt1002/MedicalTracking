package lab.c505.dto;

import lab.c505.entity.Doctor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;

/**
 * Package: lab.c505.dto
 * Description： 带有时间字符串的doctorDto
 * Author: TingTing W
 * Date: Created in 2019/6/3 20:53
 */
@Data
@Accessors(chain = true)
public class DoctorDto {
    Doctor doctor;
    String qcDateStr;
    String opqcDate;

    public DoctorDto toEntity(){
        if (doctor != null){
            try {
                doctor.setQcDate(LocalDate.parse(qcDateStr));
            }catch (Exception e){
                doctor.setQcDate(null);
            }
            try {
                doctor.setOpqcDate(LocalDate.parse((opqcDate)));
            }catch (Exception e){
                doctor.setOpqcDate(null);
            }
        }
        return this;
    }
}
