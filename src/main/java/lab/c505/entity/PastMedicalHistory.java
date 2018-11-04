package lab.c505.entity;

public class PastMedicalHistory {
    private Long pmh_id;

    private Long ar_id;

    private Byte cld;

    private Byte ckd;

    private Byte cyd;

    private Byte pad;

    private Byte mi;

    private Byte cabg;

    private Byte pci;

    private Byte other;

    private String supplement;

    public Long getPmh_id() {
        return pmh_id;
    }

    public void setPmh_id(Long pmh_id) {
        this.pmh_id = pmh_id;
    }

    public Long getAr_id() {
        return ar_id;
    }

    public void setAr_id(Long ar_id) {
        this.ar_id = ar_id;
    }

    public Byte getCld() {
        return cld;
    }

    public void setCld(Byte cld) {
        this.cld = cld;
    }

    public Byte getCkd() {
        return ckd;
    }

    public void setCkd(Byte ckd) {
        this.ckd = ckd;
    }

    public Byte getCyd() {
        return cyd;
    }

    public void setCyd(Byte cyd) {
        this.cyd = cyd;
    }

    public Byte getPad() {
        return pad;
    }

    public void setPad(Byte pad) {
        this.pad = pad;
    }

    public Byte getMi() {
        return mi;
    }

    public void setMi(Byte mi) {
        this.mi = mi;
    }

    public Byte getCabg() {
        return cabg;
    }

    public void setCabg(Byte cabg) {
        this.cabg = cabg;
    }

    public Byte getPci() {
        return pci;
    }

    public void setPci(Byte pci) {
        this.pci = pci;
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