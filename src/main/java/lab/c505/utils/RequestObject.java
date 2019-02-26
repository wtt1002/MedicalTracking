package lab.c505.utils;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Package: lab.c505.utils
 * Description： request
 * Author: TingTing W
 * Date: Created in 2019/2/24 12:05
 */
@Data
@Accessors(chain=true)
public class RequestObject implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String content;
    private Object data;

    public static RequestObject create(){
        return new RequestObject();
    }
    public RequestObject decode(Class<?> z) throws UnsupportedEncodingException, MethodArgumentNotValidException, NoSuchAlgorithmException{
        if(content!=null && !"".equals(content)){
//            String s=AesUtil.aesEcbDecode(content);
            System.out.println("######################################");
            System.out.println(content);
            System.out.println("######################################");
            data=GsonUtil.deSerializable(content, z);
//            validate(data,z);
        }
        return this;
    }

//    private void validate(Object object,Class<?> z) throws MethodArgumentNotValidException{
//        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//        Validator validator = factory.getValidator();
//        Set<ConstraintViolation<Object>> constraintViolations=validator.validate(object);
//        if(!constraintViolations.isEmpty()){
//            BindingResult bindingResult=new BeanPropertyBindingResult(this,"requestObject");
//            for (ConstraintViolation<Object> constraintViolation : constraintViolations) {
//                System.out.println(constraintViolation.getPropertyPath().toString()+":"+constraintViolation.getMessage());
//                bindingResult.addError(new FieldError("requestObject",constraintViolation.getPropertyPath().toString(), constraintViolation.getMessage()));
//            }
//            MethodArgumentNotValidException exception=new MethodArgumentNotValidException(null, bindingResult);
//            throw exception;
//        }
//
//    }


    public RequestObject encode() throws UnsupportedEncodingException, NoSuchAlgorithmException {
//        if(data!=null){
//            this.content=AesUtil.aesEcbEncode( GsonUtil.serializable(data));
//        }
        return this;
    }
    public RequestObject removeData() throws UnsupportedEncodingException{
        data=null;
        return this;
    }
}