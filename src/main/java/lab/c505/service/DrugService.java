package lab.c505.service;

import lab.c505.dto.DrugAndUseageDto;
import lab.c505.dto.QueryDrugDto;
import lab.c505.entity.Drug;
import com.baomidou.mybatisplus.extension.service.IService;
import lab.c505.entity.FollowDrugUsage;

import java.util.List;

/**
 * <p>
 * 药物表 服务类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
public interface DrugService extends IService<Drug> {

    List<QueryDrugDto> queryDrugList(String medicalHistoryId, int followUpIndex) throws Exception;

    List<QueryDrugDto> insertDrugList(List<QueryDrugDto> queryDrugDtoList) throws Exception;

    DrugAndUseageDto updateDrug(DrugAndUseageDto drugAndUseageDto) throws Exception;

    void deleteDrug(FollowDrugUsage followDrugUsage) throws Exception;
}
