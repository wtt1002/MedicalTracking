package lab.c505.entity;

public class BreathTrain {
    private Long bt_id;

    private Long fr_id;

    private String train_name;

    private Byte train_num;

    private Byte breath1_time;

    private Byte breath1_group;

    private Byte breath2_time;

    private Byte breath2_group;

    public Long getBt_id() {
        return bt_id;
    }

    public void setBt_id(Long bt_id) {
        this.bt_id = bt_id;
    }

    public Long getFr_id() {
        return fr_id;
    }

    public void setFr_id(Long fr_id) {
        this.fr_id = fr_id;
    }

    public String getTrain_name() {
        return train_name;
    }

    public void setTrain_name(String train_name) {
        this.train_name = train_name;
    }

    public Byte getTrain_num() {
        return train_num;
    }

    public void setTrain_num(Byte train_num) {
        this.train_num = train_num;
    }

    public Byte getBreath1_time() {
        return breath1_time;
    }

    public void setBreath1_time(Byte breath1_time) {
        this.breath1_time = breath1_time;
    }

    public Byte getBreath1_group() {
        return breath1_group;
    }

    public void setBreath1_group(Byte breath1_group) {
        this.breath1_group = breath1_group;
    }

    public Byte getBreath2_time() {
        return breath2_time;
    }

    public void setBreath2_time(Byte breath2_time) {
        this.breath2_time = breath2_time;
    }

    public Byte getBreath2_group() {
        return breath2_group;
    }

    public void setBreath2_group(Byte breath2_group) {
        this.breath2_group = breath2_group;
    }
}