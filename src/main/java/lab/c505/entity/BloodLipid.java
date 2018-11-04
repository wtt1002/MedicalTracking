package lab.c505.entity;

import java.util.Date;

public class BloodLipid {
    private Long bl_id;

    private Long patient_id;

    private Long fr_id;

    private Long ar_id;

    private Byte r_type;

    private Date exam_time;

    private Float tc;

    private Float tg;

    private Float ldl_c;

    private Float hdl_c;

    public Long getBl_id() {
        return bl_id;
    }

    public void setBl_id(Long bl_id) {
        this.bl_id = bl_id;
    }

    public Long getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Long patient_id) {
        this.patient_id = patient_id;
    }

    public Long getFr_id() {
        return fr_id;
    }

    public void setFr_id(Long fr_id) {
        this.fr_id = fr_id;
    }

    public Long getAr_id() {
        return ar_id;
    }

    public void setAr_id(Long ar_id) {
        this.ar_id = ar_id;
    }

    public Byte getR_type() {
        return r_type;
    }

    public void setR_type(Byte r_type) {
        this.r_type = r_type;
    }

    public Date getExam_time() {
        return exam_time;
    }

    public void setExam_time(Date exam_time) {
        this.exam_time = exam_time;
    }

    public Float getTc() {
        return tc;
    }

    public void setTc(Float tc) {
        this.tc = tc;
    }

    public Float getTg() {
        return tg;
    }

    public void setTg(Float tg) {
        this.tg = tg;
    }

    public Float getLdl_c() {
        return ldl_c;
    }

    public void setLdl_c(Float ldl_c) {
        this.ldl_c = ldl_c;
    }

    public Float getHdl_c() {
        return hdl_c;
    }

    public void setHdl_c(Float hdl_c) {
        this.hdl_c = hdl_c;
    }
}