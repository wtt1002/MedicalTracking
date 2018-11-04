package lab.c505.entity;

import java.util.Date;

public class BloodCoagulation {
    private Long bc_id;

    private Long patient_id;

    private Long fr_id;

    private Long ar_id;

    private Byte r_type;

    private Date exam_time;

    private Float inr;

    private Float d_dimer;

    public Long getBc_id() {
        return bc_id;
    }

    public void setBc_id(Long bc_id) {
        this.bc_id = bc_id;
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

    public Float getInr() {
        return inr;
    }

    public void setInr(Float inr) {
        this.inr = inr;
    }

    public Float getD_dimer() {
        return d_dimer;
    }

    public void setD_dimer(Float d_dimer) {
        this.d_dimer = d_dimer;
    }
}