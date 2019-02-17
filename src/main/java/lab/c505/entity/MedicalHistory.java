package lab.c505.entity;

import java.math.BigDecimal;
import java.util.Date;

public class MedicalHistory {
    private String medical_history_id;

    private String patient_id;

    private String admission_num;

    private Date in_time;

    private Date out_time;

    private String operate_doc;

    private String main_diagnose;

    private String risk_factor;

    private String pre_drugs;

    private Integer blood_pressure_h;

    private Integer blood_pressure_l;

    private Integer heart_rate;

    private BigDecimal height;

    private BigDecimal weight;

    private BigDecimal bmi;

    private Date create_time;

    private String create_user;

    private Date modify_time;

    private String modify_user;

    private Integer delete_flag;

    private Integer version;

    public MedicalHistory(String medical_history_id, String patient_id, String admission_num, Date in_time, Date out_time, String operate_doc, String main_diagnose, String risk_factor, String pre_drugs, Integer blood_pressure_h, Integer blood_pressure_l, Integer heart_rate, BigDecimal height, BigDecimal weight, BigDecimal bmi, Date create_time, String create_user, Date modify_time, String modify_user, Integer delete_flag, Integer version) {
        this.medical_history_id = medical_history_id;
        this.patient_id = patient_id;
        this.admission_num = admission_num;
        this.in_time = in_time;
        this.out_time = out_time;
        this.operate_doc = operate_doc;
        this.main_diagnose = main_diagnose;
        this.risk_factor = risk_factor;
        this.pre_drugs = pre_drugs;
        this.blood_pressure_h = blood_pressure_h;
        this.blood_pressure_l = blood_pressure_l;
        this.heart_rate = heart_rate;
        this.height = height;
        this.weight = weight;
        this.bmi = bmi;
        this.create_time = create_time;
        this.create_user = create_user;
        this.modify_time = modify_time;
        this.modify_user = modify_user;
        this.delete_flag = delete_flag;
        this.version = version;
    }

    public MedicalHistory() {
        super();
    }

    public String getMedical_history_id() {
        return medical_history_id;
    }

    public void setMedical_history_id(String medical_history_id) {
        this.medical_history_id = medical_history_id == null ? null : medical_history_id.trim();
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id == null ? null : patient_id.trim();
    }

    public String getAdmission_num() {
        return admission_num;
    }

    public void setAdmission_num(String admission_num) {
        this.admission_num = admission_num == null ? null : admission_num.trim();
    }

    public Date getIn_time() {
        return in_time;
    }

    public void setIn_time(Date in_time) {
        this.in_time = in_time;
    }

    public Date getOut_time() {
        return out_time;
    }

    public void setOut_time(Date out_time) {
        this.out_time = out_time;
    }

    public String getOperate_doc() {
        return operate_doc;
    }

    public void setOperate_doc(String operate_doc) {
        this.operate_doc = operate_doc == null ? null : operate_doc.trim();
    }

    public String getMain_diagnose() {
        return main_diagnose;
    }

    public void setMain_diagnose(String main_diagnose) {
        this.main_diagnose = main_diagnose == null ? null : main_diagnose.trim();
    }

    public String getRisk_factor() {
        return risk_factor;
    }

    public void setRisk_factor(String risk_factor) {
        this.risk_factor = risk_factor == null ? null : risk_factor.trim();
    }

    public String getPre_drugs() {
        return pre_drugs;
    }

    public void setPre_drugs(String pre_drugs) {
        this.pre_drugs = pre_drugs == null ? null : pre_drugs.trim();
    }

    public Integer getBlood_pressure_h() {
        return blood_pressure_h;
    }

    public void setBlood_pressure_h(Integer blood_pressure_h) {
        this.blood_pressure_h = blood_pressure_h;
    }

    public Integer getBlood_pressure_l() {
        return blood_pressure_l;
    }

    public void setBlood_pressure_l(Integer blood_pressure_l) {
        this.blood_pressure_l = blood_pressure_l;
    }

    public Integer getHeart_rate() {
        return heart_rate;
    }

    public void setHeart_rate(Integer heart_rate) {
        this.heart_rate = heart_rate;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getBmi() {
        return bmi;
    }

    public void setBmi(BigDecimal bmi) {
        this.bmi = bmi;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getCreate_user() {
        return create_user;
    }

    public void setCreate_user(String create_user) {
        this.create_user = create_user == null ? null : create_user.trim();
    }

    public Date getModify_time() {
        return modify_time;
    }

    public void setModify_time(Date modify_time) {
        this.modify_time = modify_time;
    }

    public String getModify_user() {
        return modify_user;
    }

    public void setModify_user(String modify_user) {
        this.modify_user = modify_user == null ? null : modify_user.trim();
    }

    public Integer getDelete_flag() {
        return delete_flag;
    }

    public void setDelete_flag(Integer delete_flag) {
        this.delete_flag = delete_flag;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}