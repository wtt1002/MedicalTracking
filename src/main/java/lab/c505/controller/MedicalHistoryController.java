package lab.c505.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import lab.c505.dto.*;
import lab.c505.entity.Assessment;
import lab.c505.entity.BodyComposition;
import lab.c505.entity.ExamValue;
import lab.c505.entity.MedicalHistory;
import lab.c505.service.AssessmentService;
import lab.c505.service.BodyCompositionService;
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
    @Autowired
    AssessmentService assessmentService;
    @Autowired
    BodyCompositionService bodyCompositionService;

    /**
     * 根据患者ID分页查询患者的病历
     * @param params
     * @return ResponseObject
     */
    @ResponseBody
    @RequestMapping(value = "/records",method = RequestMethod.POST)
    public ResponseObject getRecordsByPatientId(@RequestBody Map<String, Object> params){
        ResponseObject response = ResponseObject.create();
        List<RecordBriefInfoDto> dtos = new ArrayList<>();
        try {
            IPage<MedicalHistory> records = medicalHistoryService.getRecordsByPage((Integer) params.get("page"),(Integer) params.get("count"),String.valueOf(params.get("patientId")));
            for (MedicalHistory mh : records.getRecords()) {
                RecordBriefInfoDto dto = new RecordBriefInfoDto();
                dto.setMedicalHistoryId(mh.getMedicalHistoryId());
                dto.setInTime(mh.getInTime());
                dto.setOutTime(mh.getOutTime());
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


    /**
     * 添加患者病历
     * @param dto
     * @return ResponseObject
     */
    @ResponseBody
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseObject addMedicalHistory(@RequestBody MedicalHistoryDto dto){
        ResponseObject response = ResponseObject.create();
        try {
            String uuid = medicalHistoryService.addMedicalHistory(dto.formatTime().getMedicalHistory());
            response.setData(uuid);
        }catch (Exception e){
            e.printStackTrace();
            response.setMsg("插入失败").setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return response;
    }

    /**
     * 根据病历ID获取病历详情
     * @param medicalHistoryId
     * @return ResponseObject
     */
    @ResponseBody
    @RequestMapping(value = "/detail{medicalHistoryId}", method = RequestMethod.GET)
    public  ResponseObject getOneMedicalHistory(@RequestParam(value = "medicalHistoryId") String medicalHistoryId){
        ResponseObject response = ResponseObject.create();
        MedicalHistoryDto dto = new MedicalHistoryDto();
        try {
            MedicalHistory m = medicalHistoryService.getOneMedicalHistory(medicalHistoryId);
            dto.setMedicalHistory(m).stringTime();
            response.setData(dto);
        }catch (Exception e){
            e.printStackTrace();
            response.setMsg("查询失败").setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return response;
    }

    /**
     * 根据病历ID获取辅助检查数据
     * @param medicalHistoryId
     * @return ResponseObject
     */
    @ResponseBody
    @RequestMapping(value = "/exam{medicalHistoryId}", method = RequestMethod.GET)
    public  ResponseObject getMedicalHistoryExam(@RequestParam(value = "medicalHistoryId") String medicalHistoryId){
        ResponseObject response = ResponseObject.create();
        try {

            response.setData(medicalHistoryService.queryMedicalHistory(medicalHistoryId)).setMsg("查询成功");
        }catch (Exception e){
            e.printStackTrace();
            response.setMsg("查询失败").setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return response;
    }

    /**
     * 添加单类型辅助检查数据
     * @param addExamDtos
     * @return ResponseObject
     */
    @ResponseBody
    @RequestMapping(value = "/exam/addone", method = RequestMethod.POST)
    public  ResponseObject addMedicalHistoryExam(@RequestBody List<AddMedicalExamDto> addExamDtos){
        ResponseObject response = ResponseObject.create();
        try {

            response.setData(medicalHistoryService.insertMedicalExam(addExamDtos)).setMsg("添加成功");
        }catch (Exception e){
            e.printStackTrace();
            response.setMsg("添加失败").setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return response;
    }

    /**
     * 更新=单类型辅助检查数据
     * @param addExamDtos
     * @return ResponseObject
     */
    @ResponseBody
    @RequestMapping(value = "/exam/update", method = RequestMethod.POST)
    public  ResponseObject updateMedicalHistoryExam(@RequestBody List<AddMedicalExamDto> addExamDtos){
        ResponseObject response = ResponseObject.create();
        try {

            response.setData(medicalHistoryService.updateMedicalExam(addExamDtos)).setMsg("添加成功");
        }catch (Exception e){
            e.printStackTrace();
            response.setMsg("添加失败").setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return response;
    }

    /**
     * 查询入院评估
     * @param medicalHistoryId
     * @return ResponseObject
     */
    @ResponseBody
    @RequestMapping(value = "/assessment{medicalHistoryId}", method = RequestMethod.GET)
    public ResponseObject getMedicalHistoryAssessment(@RequestParam(value = "medicalHistoryId") String medicalHistoryId){
        ResponseObject response = ResponseObject.create();
        try{
            response.setData(assessmentService.getOneAssessment(medicalHistoryId)).setCode(ResponseObject.CODE_SUCCESS);
        }catch (Exception e){
            response.setMsg("查询失败").setCode(ResponseObject.CODE_SYSTEMERROR);
        }

        return response;
    }

    /**
     * 添加入院评估
     * @param assessment
     * @return ResponseObject
     */
    @ResponseBody
    @RequestMapping(value = "/assessment/addone", method = RequestMethod.POST)
    public ResponseObject addMedicalHistoryAssessment(@RequestBody Assessment assessment){
        ResponseObject response = ResponseObject.create();
        try {
            response.setData(assessmentService.addOneAssessment(assessment)).setMsg("添加成功");
        }catch (Exception e){
            e.printStackTrace();
            response.setMsg("添加失败").setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return response;
    }

    /**
     *
     * @param assessment
     * @return ResponseObject
     */
    @ResponseBody
    @RequestMapping(value = "/assessment/update", method = RequestMethod.POST)
    public  ResponseObject updateMedicalHistoryAssessment(@RequestBody Assessment assessment){
        ResponseObject response = ResponseObject.create();
        try {
            response.setData(assessmentService.updateOneAssessment(assessment)).setMsg("更新成功");
        }catch (Exception e){
            response.setMsg("更新失败").setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return response;
    }

    /**
     * 获取入院康复检查信息
     * @param params medicalHistoryId examIndex
     * @return ResponseObject
     */
    @ResponseBody
    @RequestMapping(value = "/admissionCheck/getChecks", method = RequestMethod.POST)
    public ResponseObject getMedicalHistoryAdmissionCheck(@RequestBody Map<String, Object> params){
        ResponseObject response = ResponseObject.create();
        AdmissionCheckDto dto = new AdmissionCheckDto();
        if (params.get("medicalHistoryId") == null || params.get("examIndex") == null){
            return response.setCode(ResponseObject.CODE_SYSTEMERROR).setMsg("参数有误");
        }
        try{
            String medicalHistory = (String) params.get("medicalHistoryId");
            int examIndex = (int) params.get("examIndex");
            dto.setBodyComposition(bodyCompositionService.getOneBodyComposition(medicalHistory));
            dto.setMedicalHistoryExamDtos(medicalHistoryService.queryMedicalHistoryWithConclusion(medicalHistory,examIndex));
            response.setData(dto).setMsg("查询成功");

        }catch (Exception e){
            response.setMsg("查询失败").setCode(ResponseObject.CODE_SYSTEMERROR);
        }

        return response;
    }

    /**
     * 添加人体成分分析
     * @param bodyComposition
     * @return ResponseObject
     */
    @ResponseBody
    @RequestMapping(value = "/bodyComposition/addone", method = RequestMethod.POST)
    public ResponseObject addMedicalHistoryBodyComposition(@RequestBody BodyComposition bodyComposition){
        ResponseObject response = ResponseObject.create();
        try {
            response.setData(bodyCompositionService.addOneBodyComposition(bodyComposition)).setMsg("添加成功");
        }catch (Exception e){
            e.printStackTrace();
            response.setMsg("添加失败").setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return response;
    }

    /**
     * 更新人体成分分析
     * @param bodyComposition
     * @return ResponseObject
     */
    @ResponseBody
    @RequestMapping(value = "/bodyComposition/update", method = RequestMethod.POST)
    public  ResponseObject updateMedicalHistoryBodyComposition(@RequestBody BodyComposition bodyComposition){
        ResponseObject response = ResponseObject.create();
        try {
            response.setData(bodyCompositionService.updateBodyComposition(bodyComposition)).setMsg("更新成功");
        }catch (Exception e){
            response.setMsg("更新失败").setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return response;
    }
}

