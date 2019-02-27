package lab.c505.dto;

import lab.c505.entity.Patient;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Package: lab.c505.dto
 * Description： 患者简要信息dto
 * Author: TingTing W
 * Date: Created in 2019/2/27 10:45
 */
public class PatientBriefInfoDto {
    @Getter
    private Patient patient;
    @Getter @Setter
    private String birthday;
    @Getter @Setter
    private String mainDiagnose;

    public void setPatient(Patient patient) {
        this.patient = patient;
        if (patient != null && patient.getBirthday() != null){
            this.birthday = patient.getBirthday().toString();
        }
    }
}
