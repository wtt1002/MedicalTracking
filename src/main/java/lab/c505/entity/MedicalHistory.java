package lab.c505.entity;

public class MedicalHistory {
    private Long mh_id;

    private Long fr_id;

    private Byte is_ischemia;

    private Byte is_hemorrhage;

    private Byte is_revascularization;

    private Byte nyna;

    private Byte is_weak;

    private Byte is_soreness;

    private Byte is_smoke;

    private Byte other;

    private String supplement;

    public Long getMh_id() {
        return mh_id;
    }

    public void setMh_id(Long mh_id) {
        this.mh_id = mh_id;
    }

    public Long getFr_id() {
        return fr_id;
    }

    public void setFr_id(Long fr_id) {
        this.fr_id = fr_id;
    }

    public Byte getIs_ischemia() {
        return is_ischemia;
    }

    public void setIs_ischemia(Byte is_ischemia) {
        this.is_ischemia = is_ischemia;
    }

    public Byte getIs_hemorrhage() {
        return is_hemorrhage;
    }

    public void setIs_hemorrhage(Byte is_hemorrhage) {
        this.is_hemorrhage = is_hemorrhage;
    }

    public Byte getIs_revascularization() {
        return is_revascularization;
    }

    public void setIs_revascularization(Byte is_revascularization) {
        this.is_revascularization = is_revascularization;
    }

    public Byte getNyna() {
        return nyna;
    }

    public void setNyna(Byte nyna) {
        this.nyna = nyna;
    }

    public Byte getIs_weak() {
        return is_weak;
    }

    public void setIs_weak(Byte is_weak) {
        this.is_weak = is_weak;
    }

    public Byte getIs_soreness() {
        return is_soreness;
    }

    public void setIs_soreness(Byte is_soreness) {
        this.is_soreness = is_soreness;
    }

    public Byte getIs_smoke() {
        return is_smoke;
    }

    public void setIs_smoke(Byte is_smoke) {
        this.is_smoke = is_smoke;
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