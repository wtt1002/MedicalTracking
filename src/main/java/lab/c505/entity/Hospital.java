package lab.c505.entity;

public class Hospital {
    private Long hosp_id;

    private String hosp_name;

    private String address;

    public Long getHosp_id() {
        return hosp_id;
    }

    public void setHosp_id(Long hosp_id) {
        this.hosp_id = hosp_id;
    }

    public String getHosp_name() {
        return hosp_name;
    }

    public void setHosp_name(String hosp_name) {
        this.hosp_name = hosp_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}