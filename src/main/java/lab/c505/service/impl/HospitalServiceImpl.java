package lab.c505.service.impl;

import lab.c505.entity.Hospital;
import lab.c505.mapper.HospitalMapper;
import lab.c505.service.HospitalService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Service
public class HospitalServiceImpl extends ServiceImpl<HospitalMapper, Hospital> implements HospitalService {

    @Autowired
    HospitalMapper hospitalMapper;
    @Override
    public Hospital getHospitalById(String hosId) {
        return hospitalMapper.selectById(hosId);
    }

    @Override
    public List<Hospital> getAllHospital() {
        return hospitalMapper.selectList(null);
    }
}
