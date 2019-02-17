package lab.c505.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Assessment {
    private String assessment_id;

    private BigDecimal sas_score;

    private BigDecimal sds_score;

    private BigDecimal na_score;

    private BigDecimal psqi_score;

    private BigDecimal ipqa_score;

    private BigDecimal fagerstorm_score;

    private BigDecimal left_grip;

    private BigDecimal right_grip;

    private BigDecimal three_meter_test;

    private BigDecimal four_meter_test;

    private BigDecimal stand_up_test;

    private BigDecimal left_balance_test;

    private BigDecimal right_balance_test;

    private BigDecimal sit_reach;

    private BigDecimal upperarm_circumference;

    private BigDecimal bmi;

    private BigDecimal triceps_skinfold_thickness;

    private String medical_history_id;

    private Date create_time;

    private String create_user;

    private Date modify_time;

    private String modify_user;

    private Integer delete_flag;

    private Integer version;

    public Assessment(String assessment_id, BigDecimal sas_score, BigDecimal sds_score, BigDecimal na_score, BigDecimal psqi_score, BigDecimal ipqa_score, BigDecimal fagerstorm_score, BigDecimal left_grip, BigDecimal right_grip, BigDecimal three_meter_test, BigDecimal four_meter_test, BigDecimal stand_up_test, BigDecimal left_balance_test, BigDecimal right_balance_test, BigDecimal sit_reach, BigDecimal upperarm_circumference, BigDecimal bmi, BigDecimal triceps_skinfold_thickness, String medical_history_id, Date create_time, String create_user, Date modify_time, String modify_user, Integer delete_flag, Integer version) {
        this.assessment_id = assessment_id;
        this.sas_score = sas_score;
        this.sds_score = sds_score;
        this.na_score = na_score;
        this.psqi_score = psqi_score;
        this.ipqa_score = ipqa_score;
        this.fagerstorm_score = fagerstorm_score;
        this.left_grip = left_grip;
        this.right_grip = right_grip;
        this.three_meter_test = three_meter_test;
        this.four_meter_test = four_meter_test;
        this.stand_up_test = stand_up_test;
        this.left_balance_test = left_balance_test;
        this.right_balance_test = right_balance_test;
        this.sit_reach = sit_reach;
        this.upperarm_circumference = upperarm_circumference;
        this.bmi = bmi;
        this.triceps_skinfold_thickness = triceps_skinfold_thickness;
        this.medical_history_id = medical_history_id;
        this.create_time = create_time;
        this.create_user = create_user;
        this.modify_time = modify_time;
        this.modify_user = modify_user;
        this.delete_flag = delete_flag;
        this.version = version;
    }

    public Assessment() {
        super();
    }

    public String getAssessment_id() {
        return assessment_id;
    }

    public void setAssessment_id(String assessment_id) {
        this.assessment_id = assessment_id == null ? null : assessment_id.trim();
    }

    public BigDecimal getSas_score() {
        return sas_score;
    }

    public void setSas_score(BigDecimal sas_score) {
        this.sas_score = sas_score;
    }

    public BigDecimal getSds_score() {
        return sds_score;
    }

    public void setSds_score(BigDecimal sds_score) {
        this.sds_score = sds_score;
    }

    public BigDecimal getNa_score() {
        return na_score;
    }

    public void setNa_score(BigDecimal na_score) {
        this.na_score = na_score;
    }

    public BigDecimal getPsqi_score() {
        return psqi_score;
    }

    public void setPsqi_score(BigDecimal psqi_score) {
        this.psqi_score = psqi_score;
    }

    public BigDecimal getIpqa_score() {
        return ipqa_score;
    }

    public void setIpqa_score(BigDecimal ipqa_score) {
        this.ipqa_score = ipqa_score;
    }

    public BigDecimal getFagerstorm_score() {
        return fagerstorm_score;
    }

    public void setFagerstorm_score(BigDecimal fagerstorm_score) {
        this.fagerstorm_score = fagerstorm_score;
    }

    public BigDecimal getLeft_grip() {
        return left_grip;
    }

    public void setLeft_grip(BigDecimal left_grip) {
        this.left_grip = left_grip;
    }

    public BigDecimal getRight_grip() {
        return right_grip;
    }

    public void setRight_grip(BigDecimal right_grip) {
        this.right_grip = right_grip;
    }

    public BigDecimal getThree_meter_test() {
        return three_meter_test;
    }

    public void setThree_meter_test(BigDecimal three_meter_test) {
        this.three_meter_test = three_meter_test;
    }

    public BigDecimal getFour_meter_test() {
        return four_meter_test;
    }

    public void setFour_meter_test(BigDecimal four_meter_test) {
        this.four_meter_test = four_meter_test;
    }

    public BigDecimal getStand_up_test() {
        return stand_up_test;
    }

    public void setStand_up_test(BigDecimal stand_up_test) {
        this.stand_up_test = stand_up_test;
    }

    public BigDecimal getLeft_balance_test() {
        return left_balance_test;
    }

    public void setLeft_balance_test(BigDecimal left_balance_test) {
        this.left_balance_test = left_balance_test;
    }

    public BigDecimal getRight_balance_test() {
        return right_balance_test;
    }

    public void setRight_balance_test(BigDecimal right_balance_test) {
        this.right_balance_test = right_balance_test;
    }

    public BigDecimal getSit_reach() {
        return sit_reach;
    }

    public void setSit_reach(BigDecimal sit_reach) {
        this.sit_reach = sit_reach;
    }

    public BigDecimal getUpperarm_circumference() {
        return upperarm_circumference;
    }

    public void setUpperarm_circumference(BigDecimal upperarm_circumference) {
        this.upperarm_circumference = upperarm_circumference;
    }

    public BigDecimal getBmi() {
        return bmi;
    }

    public void setBmi(BigDecimal bmi) {
        this.bmi = bmi;
    }

    public BigDecimal getTriceps_skinfold_thickness() {
        return triceps_skinfold_thickness;
    }

    public void setTriceps_skinfold_thickness(BigDecimal triceps_skinfold_thickness) {
        this.triceps_skinfold_thickness = triceps_skinfold_thickness;
    }

    public String getMedical_history_id() {
        return medical_history_id;
    }

    public void setMedical_history_id(String medical_history_id) {
        this.medical_history_id = medical_history_id == null ? null : medical_history_id.trim();
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