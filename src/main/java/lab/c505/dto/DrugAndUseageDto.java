package lab.c505.dto;

import lab.c505.entity.Drug;
import lab.c505.entity.FollowDrugUsage;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author zxp
 * @since 2019-3-12
 */

@Data
@Accessors(chain = true)
public class DrugAndUseageDto {
    private Drug drug;
    private FollowDrugUsage followDrugUsage;

    public DrugAndUseageDto(){}
    public DrugAndUseageDto(Drug drug, FollowDrugUsage followDrugUsage) {
        this.drug = drug;
        this.followDrugUsage = followDrugUsage;
    }
}
