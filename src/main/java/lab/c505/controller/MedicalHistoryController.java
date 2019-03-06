package lab.c505.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import lab.c505.dto.MedicalHistoryDto;
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
import java.util.UUID;

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
        try {
            IPage<MedicalHistory> records = medicalHistoryService.getRecordsByPage((Integer) params.get("page"),(Integer) params.get("count"),(Integer) params.get("patientId"));
            for (MedicalHistory mh : records.getRecords()) {
                RecordBriefInfoDto dto = new RecordBriefInfoDto();
                dto.setMedicalHistoryId(mh.getMedicalHistoryId());
                dto.setInTime(mh.getInTime().toString());
                dto.setOutTime(mh.getOutTime().toString());
                dto.setOperateDoc(mh.getOperateDoc());
                dto.setMainDiagnose(mh.getMainDiagnose());
                dto.setRiskFactor(mh.getRiskFactor());
                dto.setTotal(records.getTotal());
                dtos.add(dto);
            }
            response.setData(dtos).encode();
        }catch (Exception e){
            e.printStackTrace();
            response.setData("查询失败").setMsg("查询失败").setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return response;
    }

    @ResponseBody
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseObject addMedicalHistory(@RequestBody MedicalHistoryDto dto){
        ResponseObject response = ResponseObject.create();
        try {
            medicalHistoryService.addMedicalHistory(dto.formatTime().getMedicalHistory());
            response.setData("插入成功");
        }catch (Exception e){
            e.printStackTrace();
            response.setMsg("插入失败").setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return null;
    }
}

