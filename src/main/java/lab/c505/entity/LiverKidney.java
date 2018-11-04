package lab.c505.entity;

import java.util.Date;

public class LiverKidney {
    private Long lk_id;

    private Long patient_id;

    private Long fr_id;

    private Long ar_id;

    private Byte r_type;

    private Date exam_time;

    private Float alt;

    private Float ast;

    private Float glu;

    private Float ua;

    private Float cr;

    public Long getLk_id() {
        return lk_id;
    }

    public void setLk_id(Long lk_id) {
        this.lk_id = lk_id;
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

    public Float getAlt() {
        return alt;
    }

    public void setAlt(Float alt) {
        this.alt = alt;
    }

    public Float getAst() {
        return ast;
    }

    public void setAst(Float ast) {
        this.ast = ast;
    }

    public Float getGlu() {
        return glu;
    }

    public void setGlu(Float glu) {
        this.glu = glu;
    }

    public Float getUa() {
        return ua;
    }

    public void setUa(Float ua) {
        this.ua = ua;
    }

    public Float getCr() {
        return cr;
    }

    public void setCr(Float cr) {
        this.cr = cr;
    }
}