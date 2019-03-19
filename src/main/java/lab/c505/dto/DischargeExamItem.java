package lab.c505.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @package: lab.c505.dto
 * @description: PCI术后检查单项
 * @author: Liu Chenglong
 * @date: 2019-03-19 19:32
 **/
@Data
@Accessors(chain = true)
public class DischargeExamItem {
    private String examItemName;
    private String shortName;
    private String examValue;
}
