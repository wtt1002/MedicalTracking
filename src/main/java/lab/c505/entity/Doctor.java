package lab.c505.entity;

import java.util.Date;

public class Doctor {
    private String doctor_id;

    private String doctor_name;

    private Byte gender;

    private String doctor_major;

    private String dept_id;

    private String doctor_num;

    private String qc_num;

    private String qc_date;

    private String opqc_num;

    private String opqc_date;

    private Date create_time;

    private String create_user;

    private Date modify_time;

    private String modify_user;

    private Integer delete_flag;

    private Integer version;

    public Doctor(String doctor_id, String doctor_name, Byte gender, String doctor_major, String dept_id, String doctor_num, String qc_num, String qc_date, String opqc_num, String opqc_date, Date create_time, String create_user, Date modify_time, String modify_user, Integer delete_flag, Integer version) {
        this.doctor_id = doctor_id;
        this.doctor_name = doctor_name;
        this.gender = gender;
        this.doctor_major = doctor_major;
        this.dept_id = dept_id;
        this.doctor_num = doctor_num;
        this.qc_num = qc_num;
        this.qc_date = qc_date;
        this.opqc_num = opqc_num;
        this.opqc_date = opqc_date;
        this.create_time = create_time;
        this.create_user = create_user;
        this.modify_time = modify_time;
        this.modify_user = modify_user;
        this.delete_flag = delete_flag;
        this.version = version;
    }

    public Doctor() {
        super();
    }

    public String getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id == null ? null : doctor_id.trim();
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name == null ? null : doctor_name.trim();
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public String getDoctor_major() {
        return doctor_major;
    }

    public void setDoctor_major(String doctor_major) {
        this.doctor_major = doctor_major == null ? null : doctor_major.trim();
    }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id == null ? null : dept_id.trim();
    }

    public String getDoctor_num() {
        return doctor_num;
    }

    public void setDoctor_num(String doctor_num) {
        this.doctor_num = doctor_num == null ? null : doctor_num.trim();
    }

    public String getQc_num() {
        return qc_num;
    }

    public void setQc_num(String qc_num) {
        this.qc_num = qc_num == null ? null : qc_num.trim();
    }

    public String getQc_date() {
        return qc_date;
    }

    public void setQc_date(String qc_date) {
        this.qc_date = qc_date == null ? null : qc_date.trim();
    }

    public String getOpqc_num() {
        return opqc_num;
    }

    public void setOpqc_num(String opqc_num) {
        this.opqc_num = opqc_num == null ? null : opqc_num.trim();
    }

    public String getOpqc_date() {
        return opqc_date;
    }

    public void setOpqc_date(String opqc_date) {
        this.opqc_date = opqc_date == null ? null : opqc_date.trim();
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