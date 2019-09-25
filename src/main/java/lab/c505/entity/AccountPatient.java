package lab.c505.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_account_patient")
public class AccountPatient  extends Model<AccountPatient> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.UUID)
    private String id;

    private String accountId;

    private String patientId;

    /**
     * 0删除，1有效
     */
    private Integer deleteFlag;

    public static final String ID = "id";
    public static final String ACCOUNT_ID = "account_id";
    public static final String PATIENT_ID = "patient_id";
    public static final String DELETE_FLAG = "delete_flag";
}
