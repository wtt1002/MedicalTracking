package lab.c505.entity;

import java.util.Date;

public class RiskFactors {
    private String risk_factors_id;

    private Byte is_smoke;

    private Byte is_heavy;

    private Byte is_less_move;

    private Byte blood_pressure_control;

    private Byte glycemic_control;

    private Byte blood_lipid_control;

    private String follow_up_id;

    private Date create_time;

    private String create_user;

    private Date modify_time;

    private String modify_user;

    private Integer delete_flag;

    private Integer version;

    public RiskFactors(String risk_factors_id, Byte is_smoke, Byte is_heavy, Byte is_less_move, Byte blood_pressure_control, Byte glycemic_control, Byte blood_lipid_control, String follow_up_id, Date create_time, String create_user, Date modify_time, String modify_user, Integer delete_flag, Integer version) {
        this.risk_factors_id = risk_factors_id;
        this.is_smoke = is_smoke;
        this.is_heavy = is_heavy;
        this.is_less_move = is_less_move;
        this.blood_pressure_control = blood_pressure_control;
        this.glycemic_control = glycemic_control;
        this.blood_lipid_control = blood_lipid_control;
        this.follow_up_id = follow_up_id;
        this.create_time = create_time;
        this.create_user = create_user;
        this.modify_time = modify_time;
        this.modify_user = modify_user;
        this.delete_flag = delete_flag;
        this.version = version;
    }

    public RiskFactors() {
        super();
    }

    public String getRisk_factors_id() {
        return risk_factors_id;
    }

    public void setRisk_factors_id(String risk_factors_id) {
        this.risk_factors_id = risk_factors_id == null ? null : risk_factors_id.trim();
    }

    public Byte getIs_smoke() {
        return is_smoke;
    }

    public void setIs_smoke(Byte is_smoke) {
        this.is_smoke = is_smoke;
    }

    public Byte getIs_heavy() {
        return is_heavy;
    }

    public void setIs_heavy(Byte is_heavy) {
        this.is_heavy = is_heavy;
    }

    public Byte getIs_less_move() {
        return is_less_move;
    }

    public void setIs_less_move(Byte is_less_move) {
        this.is_less_move = is_less_move;
    }

    public Byte getBlood_pressure_control() {
        return blood_pressure_control;
    }

    public void setBlood_pressure_control(Byte blood_pressure_control) {
        this.blood_pressure_control = blood_pressure_control;
    }

    public Byte getGlycemic_control() {
        return glycemic_control;
    }

    public void setGlycemic_control(Byte glycemic_control) {
        this.glycemic_control = glycemic_control;
    }

    public Byte getBlood_lipid_control() {
        return blood_lipid_control;
    }

    public void setBlood_lipid_control(Byte blood_lipid_control) {
        this.blood_lipid_control = blood_lipid_control;
    }

    public String getFollow_up_id() {
        return follow_up_id;
    }

    public void setFollow_up_id(String follow_up_id) {
        this.follow_up_id = follow_up_id == null ? null : follow_up_id.trim();
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