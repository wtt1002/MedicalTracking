package lab.c505.dto;

import lab.c505.entity.Account;
import lab.c505.entity.Doctor;
import lombok.Data;
import lombok.experimental.Accessors;


@Data
@Accessors(chain = true)
public class AccountInfoDto {
    private Account account;
    private Doctor doctor;

    public AccountInfoDto(){}
    public AccountInfoDto(Account a, Doctor d){
        account = a;
        doctor = d;
        hideCode();
    }
    public void hideCode(){
        if(account != null)
            account.setLoginPassword(null);
    }
}
