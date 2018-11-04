package lab.c505.entity;

public class PciScore {
    private Long pcis_id;

    private Long ar_id;

    private Byte grace;

    private Byte dapt;

    private Byte crucede;

    public Long getPcis_id() {
        return pcis_id;
    }

    public void setPcis_id(Long pcis_id) {
        this.pcis_id = pcis_id;
    }

    public Long getAr_id() {
        return ar_id;
    }

    public void setAr_id(Long ar_id) {
        this.ar_id = ar_id;
    }

    public Byte getGrace() {
        return grace;
    }

    public void setGrace(Byte grace) {
        this.grace = grace;
    }

    public Byte getDapt() {
        return dapt;
    }

    public void setDapt(Byte dapt) {
        this.dapt = dapt;
    }

    public Byte getCrucede() {
        return crucede;
    }

    public void setCrucede(Byte crucede) {
        this.crucede = crucede;
    }
}