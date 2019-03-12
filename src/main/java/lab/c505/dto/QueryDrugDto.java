package lab.c505.dto;

import lab.c505.entity.DrugCategory;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zxp
 * @since 2019-3-12
 */

@Data
@Accessors(chain = true)
public class QueryDrugDto {

    private String drugCategoryCode;

    private String drugCategoryName;

    private List<DrugAndUseageDto> drugAndUseageDtoList;

    public QueryDrugDto(){}

    public QueryDrugDto(DrugCategory drugCategory, DrugAndUseageDto drugAndUseageDto){
        this.drugCategoryCode = drugCategory.getDrugCategoryCode();
        this.drugCategoryName = drugCategory.getDrugCategoryName();
        drugAndUseageDtoList = new ArrayList<>();
        drugAndUseageDtoList.add(drugAndUseageDto);
    }

}
