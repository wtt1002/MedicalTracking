package lab.c505.entity;

public class FlexibilityTrain {
    private Long ft_id;

    private Long fr_id;

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

    public Long getFr_id() {
        return fr_id;
    }

    public void setFr_id(Long fr_id) {
        this.fr_id = fr_id;
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