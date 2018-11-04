package lab.c505.entity;

public class FlexibilityTrain {
    private Long ft_id;

    private Long ar_id;

    private Byte train_time;

    private Byte taijiquan;

    private Byte baduanjin;

    private Byte wuqinxi;

    private String remark;

    public Long getFt_id() {
        return ft_id;
    }

    public void setFt_id(Long ft_id) {
        this.ft_id = ft_id;
    }

    public Long getAr_id() {
        return ar_id;
    }

    public void setAr_id(Long ar_id) {
        this.ar_id = ar_id;
    }

    public Byte getTrain_time() {
        return train_time;
    }

    public void setTrain_time(Byte train_time) {
        this.train_time = train_time;
    }

    public Byte getTaijiquan() {
        return taijiquan;
    }

    public void setTaijiquan(Byte taijiquan) {
        this.taijiquan = taijiquan;
    }

    public Byte getBaduanjin() {
        return baduanjin;
    }

    public void setBaduanjin(Byte baduanjin) {
        this.baduanjin = baduanjin;
    }

    public Byte getWuqinxi() {
        return wuqinxi;
    }

    public void setWuqinxi(Byte wuqinxi) {
        this.wuqinxi = wuqinxi;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}