package lab.c505.utils;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Package: lab.c505.utils
 * Description： response
 * Author: TingTing W
 * Date: Created in 2019/2/24 14:42
 */
//@Data
@Accessors(chain=true)
public class ResponseObject implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public final static String CODE_SUCCESS="0000";
    public final static String CODE_PARAMERROR="0001";
    public final static String CODE_USERERROR="0002";
    public final static String CODE_LOGINERROR="0003";
    public final static String CODE_TOKENERROR="0004";
    public final static String CODE_VALIDERROR="0005";
    public final static String CODE_SYSTEMERROR="9999";

    @Getter
    private String code;
    @Getter@Setter
    private String msg;
    @Getter@Setter
    private Object data;
    @Getter@Setter
    private String content;
    @Getter
    private boolean success;

    public ResponseObject(){
        code=CODE_SUCCESS;
        success=true;
        msg="";
    }
    public ResponseObject setCode(String code) {
        this.code = code;
        if(this.code!=null && this.code.equals(CODE_SUCCESS)){
            this.success=true;
        }
        return this;
    }
    public static ResponseObject create(){
        return new ResponseObject();
    }
    public ResponseObject encode() throws UnsupportedEncodingException, NoSuchAlgorithmException{
        if(data!=null){
            this.content = GsonUtil.serializable(data);
            System.out.println("######################################");
            System.out.println(content);
            System.out.println("######################################");
        }
        return this;
    }
    public ResponseObject removeData() throws UnsupportedEncodingException{
        data=null;
        return this;
    }

//    public Object getData() {
//        return data;
//    }
//
//    public void setData(Object data) {
//        this.data = data;
//    }
}
