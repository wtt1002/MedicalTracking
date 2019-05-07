package lab.c505.dto;

import lab.c505.entity.Pci;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @package: lab.c505.dto
 * @description: pci dto
 * @author: Liu Chenglong
 * @date: 2019-05-07 16:15
 **/
@Data
@Accessors(chain = true)
public class PciDto {
    private Pci pci;
    private String operateDuration;
}
