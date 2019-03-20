package lab.c505.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @package: lab.c505.dto
 * @description: 出院小结PCI术后检查列表
 * @author: Liu Chenglong
 * @date: 2019-03-20 15:13
 **/
@Data
@Accessors(chain = true)
public class DischargeExamItemsDto {
    private List<DischargeExamItemDto> dischargeExamItemDtos;
}
