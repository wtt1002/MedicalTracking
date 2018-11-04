package lab.c505.entity;

public class VascularComplication {
    private Long vcp_id;

    private Long ar_id;

    private Byte hemorrhage;

    private Byte hematoma;

    private Byte pseudoaneurysm;

    private Byte av_fistula;

    private Byte other;

    private String supplement;

    public Long getVcp_id() {
        return vcp_id;
    }

    public void setVcp_id(Long vcp_id) {
        this.vcp_id = vcp_id;
    }

    public Long getAr_id() {
        return ar_id;
    }

    public void setAr_id(Long ar_id) {
        this.ar_id = ar_id;
    }

    public Byte getHemorrhage() {
        return hemorrhage;
    }

    public void setHemorrhage(Byte hemorrhage) {
        this.hemorrhage = hemorrhage;
    }

    public Byte getHematoma() {
        return hematoma;
    }

    public void setHematoma(Byte hematoma) {
        this.hematoma = hematoma;
    }

    public Byte getPseudoaneurysm() {
        return pseudoaneurysm;
    }

    public void setPseudoaneurysm(Byte pseudoaneurysm) {
        this.pseudoaneurysm = pseudoaneurysm;
    }

    public Byte getAv_fistula() {
        return av_fistula;
    }

    public void setAv_fistula(Byte av_fistula) {
        this.av_fistula = av_fistula;
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