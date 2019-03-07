package lab.c505.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 冠脉介入表
 * </p>
 *
 * @author TingTing W
 * @since 2019-03-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_pci")
public class Pci extends Model<Pci> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "pci_id", type = IdType.UUID)
    private String pciId;

    private String medicalHistoryId;

    private String cabg;

    private String thrombolysis;

    private String therapyType;

    private LocalDate operateDuration;

    private Integer pcidb2;

    private String pciAntiplatelet;

    private String pciType;

    private String pciAnticoagulant;

    private String operateDrug;

    private String assistiveDevice;

    private String contrastMediumType;

    private Integer contrastMediumAmount;

    private String operateDoctor;

    private String pciInfo;

    private String pciDetail;

    private String interventionProblem;

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


    public static final String PCI_ID = "pci_id";

    public static final String MEDICAL_HISTORY_ID = "medical_history_id";

    public static final String CABG = "cabg";

    public static final String THROMBOLYSIS = "thrombolysis";

    public static final String THERAPY_TYPE = "therapy_type";

    public static final String OPERATE_DURATION = "operate_duration";

    public static final String PCIDB2 = "pcidb2";

    public static final String PCI_ANTIPLATELET = "pci_antiplatelet";

    public static final String PCI_TYPE = "pci_type";

    public static final String PCI_ANTICOAGULANT = "pci_anticoagulant";

    public static final String OPERATE_DRUG = "operate_drug";

    public static final String ASSISTIVE_DEVICE = "assistive_device";

    public static final String CONTRAST_MEDIUM_TYPE = "contrast_medium_type";

    public static final String CONTRAST_MEDIUM_AMOUNT = "contrast_medium_amount";

    public static final String OPERATE_DOCTOR = "operate_doctor";

    public static final String PCI_INFO = "pci_info";

    public static final String PCI_DETAIL = "pci_detail";

    public static final String INTERVENTION_PROBLEM = "intervention_problem";

    public static final String CREATE_TIME = "create_time";

    public static final String CREATE_USER = "create_user";

    public static final String MODIFY_TIME = "modify_time";

    public static final String MODIFY_USER = "modify_user";

    public static final String DELETE_FLAG = "delete_flag";

    public static final String VERSION = "version";

    @Override
    protected Serializable pkVal() {
        return this.pciId;
    }

}
