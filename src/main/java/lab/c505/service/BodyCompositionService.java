package lab.c505.service;

import lab.c505.entity.BodyComposition;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 人体成分分析表 服务类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
public interface BodyCompositionService extends IService<BodyComposition> {
    BodyComposition getOneBodyComposition(String medicalHistory);
    String addOneBodyComposition(BodyComposition bodyComposition) throws Exception;
    BodyComposition updateBodyComposition(BodyComposition bodyComposition) throws Exception;
}
