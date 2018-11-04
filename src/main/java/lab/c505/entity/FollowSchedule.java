package lab.c505.entity;

import java.util.Date;

public class FollowSchedule {
    private Long fs_id;

    private Long ar_id;

    private Long doctor_id;

    private Date follow_time;

    private Byte follow_status;

    public Long getFs_id() {
        return fs_id;
    }

    public void setFs_id(Long fs_id) {
        this.fs_id = fs_id;
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

    public Date getFollow_time() {
        return follow_time;
    }

    public void setFollow_time(Date follow_time) {
        this.follow_time = follow_time;
    }

    public Byte getFollow_status() {
        return follow_status;
    }

    public void setFollow_status(Byte follow_status) {
        this.follow_status = follow_status;
    }
}