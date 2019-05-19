package lab.c505.service.impl;

import lab.c505.entity.RiskFactors;
import lab.c505.mapper.RiskFactorsMapper;
import lab.c505.service.RiskFactorsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * <p>
 * 个体化危险因素控制表 服务实现类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Service
public class RiskFactorsServiceImpl extends ServiceImpl<RiskFactorsMapper, RiskFactors> implements RiskFactorsService {

    @Autowired
    RiskFactorsMapper riskFactorsMapper;

    @Override
    public RiskFactors getRiskFactors(String id) throws Exception {
        return riskFactorsMapper.selectById(id);
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
    public RiskFactors addRiskFactors(RiskFactors riskFactors) throws Exception {
        if(riskFactorsMapper.insert(riskFactors.setRiskFactorsId(UUID.randomUUID().toString())) == 0){
            throw new Exception("插入RiskFactors失败");
        }
        return riskFactors;
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
    public RiskFactors updateRiskFactors(RiskFactors riskFactors) throws Exception {
        if(riskFactorsMapper.updateById(riskFactors) == 0){
            throw new Exception("更新RiskFactors失败");
        }
        return riskFactors;
    }
}
