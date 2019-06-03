package lab.c505.dto;

import lab.c505.entity.Department;
import lab.c505.entity.Doctor;
import lab.c505.entity.Hospital;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;

/**
 * Package: lab.c505.dto
 * Description： TODO
 * Author: TingTing W
 * Date: Created in 2019/6/3 13:52
 */
@Data
@Accessors(chain = true)
public class DoctorBriefInfoDto {
    Hospital hospital;
    Department department;
    Doctor doctor;
    String qcDateStr;
    String opqcDateStr;
    private long total;

    public DoctorBriefInfoDto toEntity(){
        try {
            doctor.setQcDate(LocalDate.parse(qcDateStr));
        }catch (Exception e){
            doctor.setQcDate(null);
        }
        try {
            doctor.setOpqcDate(LocalDate.parse(opqcDateStr));
        }catch (Exception e){
            doctor.setOpqcDate(null);
        }
        return this;
    }

    public DoctorBriefInfoDto toDto(){
        if (doctor != null){
            try {
                qcDateStr = doctor.getQcDate().toString();
            }catch (Exception e){
                qcDateStr = "";
            }
            try {
                opqcDateStr = doctor.getOpqcDate().toString();
            }catch (Exception e){
                opqcDateStr = "";
            }
        }
        return this;
    }
}
