package lab.c505.entity;

import java.util.Date;

public class InspectionConclusion {
    private String inspection_conclusion_id;

    private String medical_history_id;

    private String exam_category;

    private String exam_conclusion;

    private Date exam_time;

    private Integer exam_index;

    private Date create_time;

    private String create_user;

    private Date modify_time;

    private String modify_user;

    private Integer delete_flag;

    private Integer version;

    public InspectionConclusion(String inspection_conclusion_id, String medical_history_id, String exam_category, String exam_conclusion, Date exam_time, Integer exam_index, Date create_time, String create_user, Date modify_time, String modify_user, Integer delete_flag, Integer version) {
        this.inspection_conclusion_id = inspection_conclusion_id;
        this.medical_history_id = medical_history_id;
        this.exam_category = exam_category;
        this.exam_conclusion = exam_conclusion;
        this.exam_time = exam_time;
        this.exam_index = exam_index;
        this.create_time = create_time;
        this.create_user = create_user;
        this.modify_time = modify_time;
        this.modify_user = modify_user;
        this.delete_flag = delete_flag;
        this.version = version;
    }

    public InspectionConclusion() {
        super();
    }

    public String getInspection_conclusion_id() {
        return inspection_conclusion_id;
    }

    public void setInspection_conclusion_id(String inspection_conclusion_id) {
        this.inspection_conclusion_id = inspection_conclusion_id == null ? null : inspection_conclusion_id.trim();
    }

    public String getMedical_history_id() {
        return medical_history_id;
    }

    public void setMedical_history_id(String medical_history_id) {
        this.medical_history_id = medical_history_id == null ? null : medical_history_id.trim();
    }

    public String getExam_category() {
        return exam_category;
    }

    public void setExam_category(String exam_category) {
        this.exam_category = exam_category == null ? null : exam_category.trim();
    }

    public String getExam_conclusion() {
        return exam_conclusion;
    }

    public void setExam_conclusion(String exam_conclusion) {
        this.exam_conclusion = exam_conclusion == null ? null : exam_conclusion.trim();
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