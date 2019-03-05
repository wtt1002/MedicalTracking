package lab.c505.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import lab.c505.dto.RecordBriefInfoDto;
import lab.c505.entity.MedicalHistory;
import lab.c505.service.MedicalHistoryService;
import lab.c505.utils.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 患者病史表，记录患者每一次入院信息 前端控制器
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Controller
@RequestMapping("/medicalHistory")
public class MedicalHistoryController {
    @Autowired
    MedicalHistoryService medicalHistoryService;

    @ResponseBody
    @RequestMapping(value = "/records",method = RequestMethod.POST)
    public ResponseObject getRecordsByPatientId(@RequestBody Map<String, Object> params){
        ResponseObject response = ResponseObject.create();
        List<RecordBriefInfoDto> dtos = new ArrayList<>();
        System.out.println(params.get("page"));
        System.out.println(params.get("count"));
        System.out.println(params.get("patientId"));
        try {
            IPage<MedicalHistory> records = medicalHistoryService.getRecordsByPage((Integer) params.get("page"),(Integer) params.get("count"),(Integer) params.get("patientId"));
            for (MedicalHistory mh : records.getRecords()) {
                RecordBriefInfoDto dto = new RecordBriefInfoDto();
                dto.setTotal(records.getTotal());
                dto.setInTime(mh.getInTime().toString());
                dto.setOutTime(mh.getOutTime().toString());
                dto.setOperate_doc(mh.getOperateDoc());
                dto.setMain_diagnose(mh.getMainDiagnose());
                dtos.add(dto);
            }
            response.setData(dtos).encode();
        }catch (Exception e){
            e.printStackTrace();
            response.setData("查询失败").setMsg("查询失败").setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return response;
    }
}

