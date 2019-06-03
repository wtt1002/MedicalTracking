package lab.c505.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import lab.c505.dto.DoctorBriefInfoDto;
import lab.c505.dto.PatientBriefInfoDto;
import lab.c505.entity.Doctor;
import lab.c505.entity.Hospital;
import lab.c505.entity.Patient;
import lab.c505.service.DepartmentService;
import lab.c505.service.DoctorService;
import lab.c505.service.HospitalService;
import lab.c505.utils.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 医生表 前端控制器
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Controller
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    DoctorService doctorService;
    @Autowired
    HospitalService hospitalService;
    @Autowired
    DepartmentService departmentService;

    @ResponseBody
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseObject addDoctor(@RequestBody Doctor doctor){
        ResponseObject responseObject = ResponseObject.create();
        try{
            doctorService.addOnePatient(doctor.getDoctorName(), doctor.getDeptId());
            responseObject.setData("插入成功");
        }catch (Exception e){
            e.printStackTrace();
            responseObject.setCode(ResponseObject.CODE_SYSTEMERROR).setMsg("插入失败");
        }
        return responseObject;
    }

    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public ResponseObject getPatientList(@RequestBody Map<String, Object> params){
        ResponseObject response = ResponseObject.create();
        List<Doctor> list;
        List<DoctorBriefInfoDto> dtos = new ArrayList<>();
        try {
            IPage<Doctor> ipage = doctorService.getDoctorsByPage((Integer) params.get("page"), (Integer) params.get("count"), (String) params.get("filter"));
            list = ipage.getRecords();
            if (list != null){
                for (Doctor doctor : list) {
                    DoctorBriefInfoDto dto = new DoctorBriefInfoDto();
                    dto.setTotal(ipage.getTotal());
                    dto.setDoctor(doctor);
                    dto.setHospital(hospitalService.getHospitalById(doctor.getHospitalId()));
                    dto.setDepartment(departmentService.getDepartmentById(doctor.getDeptId()));
                    dto.toDto();
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

    @ResponseBody
    @RequestMapping(value = "/getHospital",method = RequestMethod.GET)
    public ResponseObject getAllHospital(){
        ResponseObject response = ResponseObject.create();
        try {
            response.setData(hospitalService.getAllHospital());
        }catch (Exception e){
            response.setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return response;
    }

    @ResponseBody
    @RequestMapping(value = "/getDepartment",method = RequestMethod.GET)
    public ResponseObject getDepartments(@RequestParam(value = "hospitalId") String hospitalId){
        ResponseObject response = ResponseObject.create();
        try {
            response.setData(hospitalService.getHospitalById(hospitalId));
        }catch (Exception e){
            response.setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return response;
    }
}

