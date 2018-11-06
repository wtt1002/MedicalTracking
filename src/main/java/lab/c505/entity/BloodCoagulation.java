package lab.c505.entity;

import java.util.Date;

public class BloodCoagulation {
    private Long bc_id;

    private Long ar_id;

    private Date exam_time;

    private Float inr;

    private Float d_dimer;

    public Long getBc_id() {
        return bc_id;
    }

    public void setBc_id(Long bc_id) {
        this.bc_id = bc_id;
    }

    public Long getAr_id() {
        return ar_id;
    }

    public void setAr_id(Long ar_id) {
        this.ar_id = ar_id;
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