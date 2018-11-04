package lab.c505.entity;

import java.util.Date;

public class Pci {
    private Long pci_id;

    private Long ar_id;

    private Float ctnt;

    private Float ck;

    private Float ck_mb;

    private Float cr;

    private Date exam_time;

    public Long getPci_id() {
        return pci_id;
    }

    public void setPci_id(Long pci_id) {
        this.pci_id = pci_id;
    }

    public Long getAr_id() {
        return ar_id;
    }

    public void setAr_id(Long ar_id) {
        this.ar_id = ar_id;
    }

    public Float getCtnt() {
        return ctnt;
    }

    public void setCtnt(Float ctnt) {
        this.ctnt = ctnt;
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

    public Float getCr() {
        return cr;
    }

    public void setCr(Float cr) {
        this.cr = cr;
    }

    public Date getExam_time() {
        return exam_time;
    }

    public void setExam_time(Date exam_time) {
        this.exam_time = exam_time;
    }
}