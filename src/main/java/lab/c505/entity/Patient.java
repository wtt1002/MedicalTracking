package lab.c505.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 患者信息表
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_patient")
public class Patient extends Model<Patient> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "patient_id", type = IdType.AUTO)
    private Integer patientId;

    private String name;

    private String numId;

    private String gender;

    private String nation;

    private String province;

    private String city;

    private String district;

    private String address;

    private Integer age;

    private LocalDate birthday;

    private Integer sickAge;

    private String mobilePhone;

    private String telphone;

    private String emergePeople;

    private String emergePhone;

    private String emergeRelationship;

    private String married;

    private String profession;

    private String education;

    private String income;

    private String professionStatus;

    private LocalDateTime createTime;

    private String createUser;

    private LocalDateTime modifyTime;

    private String modifyUser;

    /**
     * 0删除，1有效
     */
    private Integer deleteFlag;

    /**
     * 此字段用于数据修改并发控制
     */
    private Integer version;


    public static final String PATIENT_ID = "patient_id";

    public static final String NAME = "name";

    public static final String NUM_ID = "num_id";

    public static final String GENDER = "gender";

    public static final String NATION = "nation";

    public static final String PROVINCE = "province";

    public static final String CITY = "city";

    public static final String DISTRICT = "district";

    public static final String ADDRESS = "address";

    public static final String AGE = "age";

    public static final String BIRTHDAY = "birthday";

    public static final String SICK_AGE = "sick_age";

    public static final String MOBILE_PHONE = "mobile_phone";

    public static final String TELPHONE = "telphone";

    public static final String EMERGE_PEOPLE = "emerge_people";

    public static final String EMERGE_PHONE = "emerge_phone";

    public static final String EMERGE_RELATIONSHIP = "emerge_relationship";

    public static final String MARRIED = "married";

    public static final String PROFESSION = "profession";

    public static final String EDUCATION = "education";

    public static final String INCOME = "income";

    public static final String PROFESSION_STATUS = "profession_status";

    public static final String CREATE_TIME = "create_time";

    public static final String CREATE_USER = "create_user";

    public static final String MODIFY_TIME = "modify_time";

    public static final String MODIFY_USER = "modify_user";

    public static final String DELETE_FLAG = "delete_flag";

    public static final String VERSION = "version";

    @Override
    protected Serializable pkVal() {
        return this.patientId;
    }

}
