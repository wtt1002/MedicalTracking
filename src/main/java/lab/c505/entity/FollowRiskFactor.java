package lab.c505.entity;

public class FollowRiskFactor {
    private Long frf_id;

    private Long fr_id;

    private Byte is_smoke;

    private Byte is_heavy;

    private Byte is_lessmove;

    private Byte is_bl;

    private Byte is_bs;

    private Byte is_bf;

    private Byte other;

    private String supplement;

    public Long getFrf_id() {
        return frf_id;
    }

    public void setFrf_id(Long frf_id) {
        this.frf_id = frf_id;
    }

    public Long getFr_id() {
        return fr_id;
    }

    public void setFr_id(Long fr_id) {
        this.fr_id = fr_id;
    }

    public Byte getIs_smoke() {
        return is_smoke;
    }

    public void setIs_smoke(Byte is_smoke) {
        this.is_smoke = is_smoke;
    }

    public Byte getIs_heavy() {
        return is_heavy;
    }

    public void setIs_heavy(Byte is_heavy) {
        this.is_heavy = is_heavy;
    }

    public Byte getIs_lessmove() {
        return is_lessmove;
    }

    public void setIs_lessmove(Byte is_lessmove) {
        this.is_lessmove = is_lessmove;
    }

    public Byte getIs_bl() {
        return is_bl;
    }

    public void setIs_bl(Byte is_bl) {
        this.is_bl = is_bl;
    }

    public Byte getIs_bs() {
        return is_bs;
    }

    public void setIs_bs(Byte is_bs) {
        this.is_bs = is_bs;
    }

    public Byte getIs_bf() {
        return is_bf;
    }

    public void setIs_bf(Byte is_bf) {
        this.is_bf = is_bf;
    }

    public Byte getOther() {
        return other;
    }

    public void setOther(Byte other) {
        this.other = other;
    }

    public String getSupplement() {
        return supplement;
    }

    public void setSupplement(String supplement) {
        this.supplement = supplement;
    }
}