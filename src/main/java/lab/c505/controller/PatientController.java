package lab.c505.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lab.c505.dto.PatientDto;
import lab.c505.dto.PatientBriefInfoDto;
import lab.c505.entity.AccountPatient;
import lab.c505.entity.Patient;
import lab.c505.service.AccountPatientService;
import lab.c505.service.MedicalHistoryService;
import lab.c505.service.PatientService;
import lab.c505.utils.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 患者信息表 前端控制器
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19Integer page, Integer count, String filter
 */
@Controller
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    PatientService patientService;
    @Autowired
    MedicalHistoryService medicalHistoryService;
    @Autowired
    AccountPatientService accountPatientService;

    /**
     * 查询所有患者
     * @param params
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public ResponseObject getPatientList(@RequestBody Map<String, Object> params){
        ResponseObject response = ResponseObject.create();
        List<Patient> list;
        List<PatientBriefInfoDto> dtos = new ArrayList<>();
        try {
//            IPage<Patient> ipage = patientService.getPatientsByPage((String) params.get("accountId"),
//                    (Integer) params.get("page"), (Integer) params.get("count"), (String) params.get("filter"));
            String filter = "".equals(params.get("filter"))? null: (String) params.get("filter");
            IPage<Patient> ipage = accountPatientService.getPatientsByPage(new Page<>((Integer) params.get("page"),
                    (Integer) params.get("count")), (String) params.get("accountId"), filter);
            list = ipage.getRecords();
            if (list != null){
                for (Patient p : list) {
                    PatientBriefInfoDto dto = new PatientBriefInfoDto();
                    dto.setTotal(ipage.getTotal());
                    dto.setPatient(p);
                    if (p.getBirthday() != null){
                        dto.setBirthday(p.getBirthday().toString());
                    }
                    dto.setMainDiagnose(medicalHistoryService.getLastMainDiagnose(p.getPatientId()));
                    dtos.add(dto);
                }
            }
            response.setData(dtos).encode().setCode(ResponseObject.CODE_SUCCESS);
        }catch (IllegalArgumentException e){
            response.setData(e.getMessage()).setCode(ResponseObject.CODE_PARAMERROR).setMsg(e.getMessage());
        } catch (Exception e){
            e.printStackTrace();
            response.setData(e.getMessage()).setCode(ResponseObject.CODE_VALIDERROR).setMsg(e.getMessage());
        }
        return response;
    }

    /**
     * 添加单个患者
     * @param addPatientDto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseObject addPatient(@RequestBody PatientDto addPatientDto){
        ResponseObject response = ResponseObject.create();
        try {
            Patient patient = addPatientDto.setBirthday().getPatient();
            patientService.addOnePatient(patient);
            // 维护新增患者与对应管理员的信息
            AccountPatient accountPatient = new AccountPatient();
            accountPatient.setAccountId(addPatientDto.getAccountId());
            accountPatient.setPatientId(patient.getPatientId());
            accountPatientService.addOneAccountPatient(accountPatient);
            response.setData("插入成功");
        }catch (Exception e){
            e.printStackTrace();
            response.setMsg("插入失败").setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return response;
    }

    /**
     * 查询单个患者
     * @param patientId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/edit{patientId}",method = RequestMethod.GET)
    public ResponseObject getOnePatient(@RequestParam(value = "patientId") String patientId){
        ResponseObject response = ResponseObject.create();
        PatientDto dto = new PatientDto();
        try{
            Patient patient = patientService.getById(patientId);
            dto.setPatient(patient);
            dto.getBirthday();
            response.setData(dto).encode();
        }catch (Exception e){
            e.printStackTrace();
            response.setMsg("查询失败，暂不能编辑").setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        System.out.println(response.toString());
        return response;
    }

    @ResponseBody
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public ResponseBody savePatient(@RequestBody PatientDto dto){
        ResponseObject response = ResponseObject.create();
        try {
            patientService.uptOnePatient(dto.setBirthday().getPatient());
            response.setData("更新成功").setMsg("更新成功");
        }catch (Exception e){
            e.printStackTrace();
            response.setMsg("更新失败").setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return null;
    }

    /**
     * 删除患者
     * @param patientId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/remove{patientId}",method = RequestMethod.GET)
    public ResponseObject removePatient(@RequestParam(value = "patientId") String patientId){
        ResponseObject response = ResponseObject.create();
        try{
            patientService.removeOnePatient(patientId);
            response.setData("删除成功").setMsg("删除成功");
        }catch (Exception e){
            e.printStackTrace();
            response.setMsg("删除失败").setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return response;
    }

    /**
     * 批量删除患者
     * @param ids
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/batchRemove",method = RequestMethod.POST)
    public ResponseObject batchRemovePatient(@RequestBody List<String> ids){
        ResponseObject response = ResponseObject.create();
        try {
            patientService.batchRemovePatient(ids);
            response.setData("批量删除成功").setMsg("批量删除成功");
        }catch (Exception e){
            e.printStackTrace();
            response.setMsg("批量删除失败").setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return response;
    }

}

