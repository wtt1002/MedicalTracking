package lab.c505.entity;

public class Walk {
    private Long wt_id;

    private Long ar_id;

    private Float walking;

    private Float heart_func;

    private Float borg;

    public Long getWt_id() {
        return wt_id;
    }

    public void setWt_id(Long wt_id) {
        this.wt_id = wt_id;
    }

    public Long getAr_id() {
        return ar_id;
    }

    public void setAr_id(Long ar_id) {
        this.ar_id = ar_id;
    }

    public Float getWalking() {
        return walking;
    }

    public void setWalking(Float walking) {
        this.walking = walking;
    }

    public Float getHeart_func() {
        return heart_func;
    }

    public void setHeart_func(Float heart_func) {
        this.heart_func = heart_func;
    }

    public Float getBorg() {
        return borg;
    }

    public void setBorg(Float borg) {
        this.borg = borg;
    }
}