package lab.c505.entity;

import java.util.Date;

public class Pci {
    private String pci_id;

    private String medical_history_id;

    private String cabg;

    private String thrombolysis;

    private String therapy_type;

    private Date operate_duration;

    private Integer pcidb2;

    private String pci_antiplatelet;

    private String pci_type;

    private String pci_anticoagulant;

    private String operate_drug;

    private String assistive_device;

    private String contrast_medium_type;

    private Integer contrast_medium_amount;

    private String operate_doctor;

    private String pci_info;

    private String pci_detail;

    private String intervention_problem;

    private Date create_time;

    private String create_user;

    private Date modify_time;

    private String modify_user;

    private Integer delete_flag;

    private Integer version;

    public Pci(String pci_id, String medical_history_id, String cabg, String thrombolysis, String therapy_type, Date operate_duration, Integer pcidb2, String pci_antiplatelet, String pci_type, String pci_anticoagulant, String operate_drug, String assistive_device, String contrast_medium_type, Integer contrast_medium_amount, String operate_doctor, String pci_info, String pci_detail, String intervention_problem, Date create_time, String create_user, Date modify_time, String modify_user, Integer delete_flag, Integer version) {
        this.pci_id = pci_id;
        this.medical_history_id = medical_history_id;
        this.cabg = cabg;
        this.thrombolysis = thrombolysis;
        this.therapy_type = therapy_type;
        this.operate_duration = operate_duration;
        this.pcidb2 = pcidb2;
        this.pci_antiplatelet = pci_antiplatelet;
        this.pci_type = pci_type;
        this.pci_anticoagulant = pci_anticoagulant;
        this.operate_drug = operate_drug;
        this.assistive_device = assistive_device;
        this.contrast_medium_type = contrast_medium_type;
        this.contrast_medium_amount = contrast_medium_amount;
        this.operate_doctor = operate_doctor;
        this.pci_info = pci_info;
        this.pci_detail = pci_detail;
        this.intervention_problem = intervention_problem;
        this.create_time = create_time;
        this.create_user = create_user;
        this.modify_time = modify_time;
        this.modify_user = modify_user;
        this.delete_flag = delete_flag;
        this.version = version;
    }

    public Pci() {
        super();
    }

    public String getPci_id() {
        return pci_id;
    }

    public void setPci_id(String pci_id) {
        this.pci_id = pci_id == null ? null : pci_id.trim();
    }

    public String getMedical_history_id() {
        return medical_history_id;
    }

    public void setMedical_history_id(String medical_history_id) {
        this.medical_history_id = medical_history_id == null ? null : medical_history_id.trim();
    }

    public String getCabg() {
        return cabg;
    }

    public void setCabg(String cabg) {
        this.cabg = cabg == null ? null : cabg.trim();
    }

    public String getThrombolysis() {
        return thrombolysis;
    }

    public void setThrombolysis(String thrombolysis) {
        this.thrombolysis = thrombolysis == null ? null : thrombolysis.trim();
    }

    public String getTherapy_type() {
        return therapy_type;
    }

    public void setTherapy_type(String therapy_type) {
        this.therapy_type = therapy_type == null ? null : therapy_type.trim();
    }

    public Date getOperate_duration() {
        return operate_duration;
    }

    public void setOperate_duration(Date operate_duration) {
        this.operate_duration = operate_duration;
    }

    public Integer getPcidb2() {
        return pcidb2;
    }

    public void setPcidb2(Integer pcidb2) {
        this.pcidb2 = pcidb2;
    }

    public String getPci_antiplatelet() {
        return pci_antiplatelet;
    }

    public void setPci_antiplatelet(String pci_antiplatelet) {
        this.pci_antiplatelet = pci_antiplatelet == null ? null : pci_antiplatelet.trim();
    }

    public String getPci_type() {
        return pci_type;
    }

    public void setPci_type(String pci_type) {
        this.pci_type = pci_type == null ? null : pci_type.trim();
    }

    public String getPci_anticoagulant() {
        return pci_anticoagulant;
    }

    public void setPci_anticoagulant(String pci_anticoagulant) {
        this.pci_anticoagulant = pci_anticoagulant == null ? null : pci_anticoagulant.trim();
    }

    public String getOperate_drug() {
        return operate_drug;
    }

    public void setOperate_drug(String operate_drug) {
        this.operate_drug = operate_drug == null ? null : operate_drug.trim();
    }

    public String getAssistive_device() {
        return assistive_device;
    }

    public void setAssistive_device(String assistive_device) {
        this.assistive_device = assistive_device == null ? null : assistive_device.trim();
    }

    public String getContrast_medium_type() {
        return contrast_medium_type;
    }

    public void setContrast_medium_type(String contrast_medium_type) {
        this.contrast_medium_type = contrast_medium_type == null ? null : contrast_medium_type.trim();
    }

    public Integer getContrast_medium_amount() {
        return contrast_medium_amount;
    }

    public void setContrast_medium_amount(Integer contrast_medium_amount) {
        this.contrast_medium_amount = contrast_medium_amount;
    }

    public String getOperate_doctor() {
        return operate_doctor;
    }

    public void setOperate_doctor(String operate_doctor) {
        this.operate_doctor = operate_doctor == null ? null : operate_doctor.trim();
    }

    public String getPci_info() {
        return pci_info;
    }

    public void setPci_info(String pci_info) {
        this.pci_info = pci_info == null ? null : pci_info.trim();
    }

    public String getPci_detail() {
        return pci_detail;
    }

    public void setPci_detail(String pci_detail) {
        this.pci_detail = pci_detail == null ? null : pci_detail.trim();
    }

    public String getIntervention_problem() {
        return intervention_problem;
    }

    public void setIntervention_problem(String intervention_problem) {
        this.intervention_problem = intervention_problem == null ? null : intervention_problem.trim();
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