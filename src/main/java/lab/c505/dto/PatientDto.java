package lab.c505.dto;

import lab.c505.entity.Patient;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;

/**
 * Package: lab.c505.dto
 * Description： 添加患者dto
 * Author: TingTing W
 * Date: Created in 2019/2/28 15:55
 */

@Data
@Accessors(chain = true)
public class PatientDto {
    private String accountId;
    private Patient patient;
    private String birthdayStr;

    public PatientDto setBirthday() throws Exception{
        if (birthdayStr != null && !birthdayStr.equals("")  && patient != null){
            patient.setBirthday(LocalDate.parse(birthdayStr));
        }else {
            patient.setBirthday(null);
        }
        return this;
    }

    public void getBirthday() throws Exception{
        if (patient != null && patient.getBirthday() != null){
            this.birthdayStr = patient.getBirthday().toString();
        }
    }

    public String getAccountId() {
        return accountId;
    }
}
