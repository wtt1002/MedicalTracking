package lab.c505.entity;

public class RiskFactor {
    private Long rf_id;

    private Long ar_id;

    private Byte smoke;

    private Byte coronary_heart;

    private Byte hypertension;

    private Byte dyslipidemia;

    private Byte diabetes;

    private Byte renal_inadequacy;

    private Byte pcad;

    private Byte other;

    private String supplement;

    public Long getRf_id() {
        return rf_id;
    }

    public void setRf_id(Long rf_id) {
        this.rf_id = rf_id;
    }

    public Long getAr_id() {
        return ar_id;
    }

    public void setAr_id(Long ar_id) {
        this.ar_id = ar_id;
    }

    public Byte getSmoke() {
        return smoke;
    }

    public void setSmoke(Byte smoke) {
        this.smoke = smoke;
    }

    public Byte getCoronary_heart() {
        return coronary_heart;
    }

    public void setCoronary_heart(Byte coronary_heart) {
        this.coronary_heart = coronary_heart;
    }

    public Byte getHypertension() {
        return hypertension;
    }

    public void setHypertension(Byte hypertension) {
        this.hypertension = hypertension;
    }

    public Byte getDyslipidemia() {
        return dyslipidemia;
    }

    public void setDyslipidemia(Byte dyslipidemia) {
        this.dyslipidemia = dyslipidemia;
    }

    public Byte getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(Byte diabetes) {
        this.diabetes = diabetes;
    }

    public Byte getRenal_inadequacy() {
        return renal_inadequacy;
    }

    public void setRenal_inadequacy(Byte renal_inadequacy) {
        this.renal_inadequacy = renal_inadequacy;
    }

    public Byte getPcad() {
        return pcad;
    }

    public void setPcad(Byte pcad) {
        this.pcad = pcad;
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