package lab.c505.dto;

import com.fasterxml.jackson.databind.util.BeanUtil;
import lab.c505.entity.ExamItem;
import lab.c505.entity.ExamValue;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.beans.BeanUtils;

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
    private String examTimeStr;

    public DischargeExamItemDto(){};
    public DischargeExamItemDto(ExamItem examItem, ExamValue examValue){
        BeanUtils.copyProperties(examItem, this);
        BeanUtils.copyProperties(examValue, this);
        examTimeStr = examValue.getExamTime().toString();
    }
}
