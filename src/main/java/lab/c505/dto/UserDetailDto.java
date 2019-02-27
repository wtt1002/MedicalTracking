package lab.c505.dto;

import lab.c505.entity.Account;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Package: lab.c505.dto
 * Description： 用户dto
 * Author: TingTing W
 * Date: Created in 2019/2/26 15:47
 */

@Data
@Accessors(chain = true)
public class UserDetailDto {
    @Getter @Setter
    private Account account;
    @Getter @Setter
    private String docName;
}
