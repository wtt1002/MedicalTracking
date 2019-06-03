package lab.c505.service;

import lab.c505.entity.Hospital;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
public interface HospitalService extends IService<Hospital> {
    Hospital getHospitalById(String hosId);
    List<Hospital> getAllHospital();
}
