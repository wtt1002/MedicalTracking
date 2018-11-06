package lab.c505.entity;

import java.util.Date;

public class OtherExam {
    private Long oe_id;

    private Long ar_id;

    private Date exam_time;

    private Float ghb;

    private Float ctnt;

    private Float nt_probnp;

    private Float ck;

    private Float ck_mb;

    private Float lvef;

    public Long getOe_id() {
        return oe_id;
    }

    public void setOe_id(Long oe_id) {
        this.oe_id = oe_id;
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

    public Float getGhb() {
        return ghb;
    }

    public void setGhb(Float ghb) {
        this.ghb = ghb;
    }

    public Float getCtnt() {
        return ctnt;
    }

    public void setCtnt(Float ctnt) {
        this.ctnt = ctnt;
    }

    public Float getNt_probnp() {
        return nt_probnp;
    }

    public void setNt_probnp(Float nt_probnp) {
        this.nt_probnp = nt_probnp;
    }

    public Float getCk() {
        return ck;
    }

    public void setCk(Float ck) {
        this.ck = ck;
    }

    public Float getCk_mb() {
        return ck_mb;
    }

    public void setCk_mb(Float ck_mb) {
        this.ck_mb = ck_mb;
    }

    public Float getLvef() {
        return lvef;
    }

    public void setLvef(Float lvef) {
        this.lvef = lvef;
    }
}