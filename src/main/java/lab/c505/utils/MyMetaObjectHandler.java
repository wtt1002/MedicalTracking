package lab.c505.utils;

import java.time.LocalDateTime;

import lab.c505.exeception.VersionException;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
/**
 * 
 *@comment  

 *@author huchunhe

 *@date 2018-09-28

 *@version 1.0.0

 *@company 东巴文信息技术有限公司
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyMetaObjectHandler.class);

    @Override
    public void insertFill(MetaObject metaObject) { 
        LocalDateTime date =LocalDateTime.now();
        Object createDate = this.getFieldValByName("createTime", metaObject);
        if (createDate == null) { 
            LOGGER.debug("公共字段【createTime】值为空，自动填充值为："+date);
            setFieldValByName("createTime",date, metaObject);
        }
        Object createUser = this.getFieldValByName("createUser", metaObject);
        if (createUser == null) { 
            LOGGER.debug("公共字段【createUser】值为空，自动填充值为：xxx");
            setFieldValByName("createUser","xxx", metaObject);
        } 
        Object deleteFlag= this.getFieldValByName("deleteFlag", metaObject);
        if (deleteFlag == null) { 
            LOGGER.debug("公共字段【deleteFlag】值为空，自动填充值为：1");
            setFieldValByName("deleteFlag",1, metaObject);
        }
        Object version = this.getFieldValByName("version", metaObject);
        if (version == null) {
            LOGGER.debug("公共字段【version】值为空，自动填充值为：1" );
            setFieldValByName("version",1, metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) throws VersionException {
        LocalDateTime date =LocalDateTime.now(); 
//        Object modifyDate = this.getFieldValByName("modifyTime", metaObject);
//        if (modifyDate == null) { 
            LOGGER.debug("公共字段【modifyTime】自动填充值为："+date);
            setFieldValByName("modifyTime",date, metaObject);
//        }
        @SuppressWarnings("unused")
		Object modifyUser = this.getFieldValByName("modifyUser", metaObject);
//        if (modifyUser == null) { 
            LOGGER.debug("公共字段【modifyUser】值为空，自动填充值为：yyy");
            setFieldValByName("modifyUser","wtt", metaObject);
//        }  
        Object version = this.getFieldValByName("version", metaObject);
        if (version == null || "".equals(version.toString())) {
            throw new VersionException("数据版本不能为空");
        }
    }

    
}