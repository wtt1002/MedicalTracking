package lab.c505.service;

import lab.c505.entity.RiskFactors;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 个体化危险因素控制表 服务类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
public interface RiskFactorsService extends IService<RiskFactors> {
    RiskFactors getRiskFactors(String id) throws Exception;
    RiskFactors addRiskFactors(RiskFactors riskFactors) throws Exception;
    RiskFactors updateRiskFactors(RiskFactors riskFactors) throws Exception;
}
