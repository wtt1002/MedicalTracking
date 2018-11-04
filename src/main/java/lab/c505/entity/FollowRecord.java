package lab.c505.entity;

import java.util.Date;

public class FollowRecord {
    private Long fr_id;

    private Long ar_id;

    private Long doctor_id;

    private Long fs_id;

    private Date real_time;

    private String follow_doctor;

    private Byte follow_way;

    private Byte follow_interval;

    private Byte recover_status;

    private Byte is_revisit;

    private Date record_crt_time;

    private Date record_upt_time;

    private Byte record_status;

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

    public Long getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(Long doctor_id) {
        this.doctor_id = doctor_id;
    }

    public Long getFs_id() {
        return fs_id;
    }

    public void setFs_id(Long fs_id) {
        this.fs_id = fs_id;
    }

    public Date getReal_time() {
        return real_time;
    }

    public void setReal_time(Date real_time) {
        this.real_time = real_time;
    }

    public String getFollow_doctor() {
        return follow_doctor;
    }

    public void setFollow_doctor(String follow_doctor) {
        this.follow_doctor = follow_doctor;
    }

    public Byte getFollow_way() {
        return follow_way;
    }

    public void setFollow_way(Byte follow_way) {
        this.follow_way = follow_way;
    }

    public Byte getFollow_interval() {
        return follow_interval;
    }

    public void setFollow_interval(Byte follow_interval) {
        this.follow_interval = follow_interval;
    }

    public Byte getRecover_status() {
        return recover_status;
    }

    public void setRecover_status(Byte recover_status) {
        this.recover_status = recover_status;
    }

    public Byte getIs_revisit() {
        return is_revisit;
    }

    public void setIs_revisit(Byte is_revisit) {
        this.is_revisit = is_revisit;
    }

    public Date getRecord_crt_time() {
        return record_crt_time;
    }

    public void setRecord_crt_time(Date record_crt_time) {
        this.record_crt_time = record_crt_time;
    }

    public Date getRecord_upt_time() {
        return record_upt_time;
    }

    public void setRecord_upt_time(Date record_upt_time) {
        this.record_upt_time = record_upt_time;
    }

    public Byte getRecord_status() {
        return record_status;
    }

    public void setRecord_status(Byte record_status) {
        this.record_status = record_status;
    }
}