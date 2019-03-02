package lab.c505.dto;

import lab.c505.entity.Patient;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * Package: lab.c505.dto
 * Description： 患者简要信息dto
 * Author: TingTing W
 * Date: Created in 2019/2/27 10:45
 */
@Data
@Accessors(chain = true)
public class PatientBriefInfoDto {
    private Patient patient;
    private String birthday;
    private String mainDiagnose;
    private long total;

    public void setPatient(Patient patient) {
        this.patient = patient;
        if (patient != null && patient.getBirthday() != null){
            this.birthday = patient.getBirthday().toString();
        }
    }
}
