package lab.c505.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * @package: lab.c505.dto
 * @description: PCI术后检查单项
 * @author: Liu Chenglong
 * @date: 2019-03-19 19:32
 **/
@Data
@Accessors(chain = true)
public class DischargeExamItemDto {
    private String examValueId;
    private Integer examIndex;
    private String examItemName;
    private String examItemCode;
    private String medicalHistoryId;
    private String shortName;
    private BigDecimal examValue;
    private String examTime;
}
