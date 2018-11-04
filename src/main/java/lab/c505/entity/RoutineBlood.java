package lab.c505.entity;

import java.util.Date;

public class RoutineBlood {
    private Long rb_id;

    private Long patient_id;

    private Long fr_id;

    private Long ar_id;

    private Byte r_type;

    private Date exam_time;

    private Float wbc;

    private Float rbc;

    private Float plt;

    private Float hgb;

    public Long getRb_id() {
        return rb_id;
    }

    public void setRb_id(Long rb_id) {
        this.rb_id = rb_id;
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

    public Float getWbc() {
        return wbc;
    }

    public void setWbc(Float wbc) {
        this.wbc = wbc;
    }

    public Float getRbc() {
        return rbc;
    }

    public void setRbc(Float rbc) {
        this.rbc = rbc;
    }

    public Float getPlt() {
        return plt;
    }

    public void setPlt(Float plt) {
        this.plt = plt;
    }

    public Float getHgb() {
        return hgb;
    }

    public void setHgb(Float hgb) {
        this.hgb = hgb;
    }
}