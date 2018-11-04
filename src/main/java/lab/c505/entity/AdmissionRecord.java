package lab.c505.entity;

import java.util.Date;

public class AdmissionRecord {
    private Long ar_id;

    private Long hosp_id;

    private Long patient_id;

    private String ad_number;

    private String operator;

    private Byte main_diag;

    private String detail_diag;

    private Date create_time;

    private Date upt_time;

    public Long getAr_id() {
        return ar_id;
    }

    public void setAr_id(Long ar_id) {
        this.ar_id = ar_id;
    }

    public Long getHosp_id() {
        return hosp_id;
    }

    public void setHosp_id(Long hosp_id) {
        this.hosp_id = hosp_id;
    }

    public Long getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Long patient_id) {
        this.patient_id = patient_id;
    }

    public String getAd_number() {
        return ad_number;
    }

    public void setAd_number(String ad_number) {
        this.ad_number = ad_number;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Byte getMain_diag() {
        return main_diag;
    }

    public void setMain_diag(Byte main_diag) {
        this.main_diag = main_diag;
    }

    public String getDetail_diag() {
        return detail_diag;
    }

    public void setDetail_diag(String detail_diag) {
        this.detail_diag = detail_diag;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpt_time() {
        return upt_time;
    }

    public void setUpt_time(Date upt_time) {
        this.upt_time = upt_time;
    }
}