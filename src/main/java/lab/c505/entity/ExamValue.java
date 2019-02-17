package lab.c505.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ExamValue {
    private String exam_value_id;

    private String exam_item_id;

    private String medical_history_id;

    private BigDecimal exam_value;

    private Date exam_time;

    private Integer exam_index;

    private Date create_time;

    private String create_user;

    private Date modify_time;

    private String modify_user;

    private Integer delete_flag;

    private Integer version;

    public ExamValue(String exam_value_id, String exam_item_id, String medical_history_id, BigDecimal exam_value, Date exam_time, Integer exam_index, Date create_time, String create_user, Date modify_time, String modify_user, Integer delete_flag, Integer version) {
        this.exam_value_id = exam_value_id;
        this.exam_item_id = exam_item_id;
        this.medical_history_id = medical_history_id;
        this.exam_value = exam_value;
        this.exam_time = exam_time;
        this.exam_index = exam_index;
        this.create_time = create_time;
        this.create_user = create_user;
        this.modify_time = modify_time;
        this.modify_user = modify_user;
        this.delete_flag = delete_flag;
        this.version = version;
    }

    public ExamValue() {
        super();
    }

    public String getExam_value_id() {
        return exam_value_id;
    }

    public void setExam_value_id(String exam_value_id) {
        this.exam_value_id = exam_value_id == null ? null : exam_value_id.trim();
    }

    public String getExam_item_id() {
        return exam_item_id;
    }

    public void setExam_item_id(String exam_item_id) {
        this.exam_item_id = exam_item_id == null ? null : exam_item_id.trim();
    }

    public String getMedical_history_id() {
        return medical_history_id;
    }

    public void setMedical_history_id(String medical_history_id) {
        this.medical_history_id = medical_history_id == null ? null : medical_history_id.trim();
    }

    public BigDecimal getExam_value() {
        return exam_value;
    }

    public void setExam_value(BigDecimal exam_value) {
        this.exam_value = exam_value;
    }

    public Date getExam_time() {
        return exam_time;
    }

    public void setExam_time(Date exam_time) {
        this.exam_time = exam_time;
    }

    public Integer getExam_index() {
        return exam_index;
    }

    public void setExam_index(Integer exam_index) {
        this.exam_index = exam_index;
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