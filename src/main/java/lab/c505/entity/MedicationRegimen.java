package lab.c505.entity;

public class MedicationRegimen {
    private Long mr_id;

    private Long patient_id;

    private Long ar_id;

    private String drug_name;

    private String drug_num;

    private Byte drug_time;

    private String remark;

    public Long getMr_id() {
        return mr_id;
    }

    public void setMr_id(Long mr_id) {
        this.mr_id = mr_id;
    }

    public Long getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Long patient_id) {
        this.patient_id = patient_id;
    }

    public Long getAr_id() {
        return ar_id;
    }

    public void setAr_id(Long ar_id) {
        this.ar_id = ar_id;
    }

    public String getDrug_name() {
        return drug_name;
    }

    public void setDrug_name(String drug_name) {
        this.drug_name = drug_name;
    }

    public String getDrug_num() {
        return drug_num;
    }

    public void setDrug_num(String drug_num) {
        this.drug_num = drug_num;
    }

    public Byte getDrug_time() {
        return drug_time;
    }

    public void setDrug_time(Byte drug_time) {
        this.drug_time = drug_time;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}