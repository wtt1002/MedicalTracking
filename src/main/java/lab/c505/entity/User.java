package lab.c505.entity;

public class User {
    private Long user_id;

    private String user_account;

    private String user_phone;

    private String user_psw;

    private String user_name;

    private Byte user_type;

    private Byte user_status;

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUser_account() {
        return user_account;
    }

    public void setUser_account(String user_account) {
        this.user_account = user_account;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_psw() {
        return user_psw;
    }

    public void setUser_psw(String user_psw) {
        this.user_psw = user_psw;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Byte getUser_type() {
        return user_type;
    }

    public void setUser_type(Byte user_type) {
        this.user_type = user_type;
    }

    public Byte getUser_status() {
        return user_status;
    }

    public void setUser_status(Byte user_status) {
        this.user_status = user_status;
    }
}