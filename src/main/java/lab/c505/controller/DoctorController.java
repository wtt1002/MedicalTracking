package lab.c505.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import lab.c505.dto.DoctorBriefInfoDto;
import lab.c505.dto.DoctorDto;
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

    /**
     * 添加医生
     * @param doctorDto 医生实体dto
     * @return ResponseObject
     */
    @ResponseBody
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseObject addDoctor(@RequestBody DoctorDto doctorDto){
        ResponseObject responseObject = ResponseObject.create();
        try{

            responseObject.setMsg("插入成功").setData(doctorService.addOnePatient(doctorDto.toEntity().getDoctor()));
        }catch (Exception e){
            e.printStackTrace();
            responseObject.setCode(ResponseObject.CODE_SYSTEMERROR).setMsg("插入失败");
        }
        return responseObject;
    }
    /**
     * 更新医生信息
     * @param doctorDto 医生实体dto
     * @return ResponseObject
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ResponseObject updateDoctor(@RequestBody DoctorDto doctorDto){
        ResponseObject responseObject = ResponseObject.create();
        try{

            responseObject.setMsg("更新成功").setData(doctorService.updateDoctor(doctorDto.toEntity().getDoctor()));
        }catch (Exception e){
            e.printStackTrace();
            responseObject.setCode(ResponseObject.CODE_SYSTEMERROR).setMsg("更新失败");
        }
        return responseObject;
    }

    /**
     * 删除医生信息
     * @param doctorId 医生id
     * @return ResponseObject
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public ResponseObject deleteDoctor(@RequestParam(value = "doctorId") String doctorId){
        ResponseObject responseObject = ResponseObject.create();
        try{
            doctorService.deleteDoctor(doctorId);
            responseObject.setMsg("删除成功");
        }catch (Exception e){
            e.printStackTrace();
            responseObject.setCode(ResponseObject.CODE_SYSTEMERROR).setMsg("删除失败");
        }
        return responseObject;
    }
    /**
     * 分页查询医生信息
     * @param params 分解查询参数 page count filter
     * @return ResponseObject
     */
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
            response.setData(dtos).setCode(ResponseObject.CODE_SUCCESS);
        }catch (IllegalArgumentException e){
            response.setData(e.getMessage()).setCode(ResponseObject.CODE_PARAMERROR).setMsg(e.getMessage());
        } catch (Exception e){
            e.printStackTrace();
            response.setData(e.getMessage()).setCode(ResponseObject.CODE_VALIDERROR).setMsg(e.getMessage());
        }
        return response;
    }

    /**
     * 查询医院信息
     * @return ResponseObject
     */
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

    /**
     * 查询医院部门信息
     * @param hospitalId 医院id
     * @return ResponseObject
     */
    @ResponseBody
    @RequestMapping(value = "/getDepartment",method = RequestMethod.GET)
    public ResponseObject getDepartments(@RequestParam(value = "hospitalId") String hospitalId){
        ResponseObject response = ResponseObject.create();
        try {
            response.setData(departmentService.getDepartmentsByHosId(hospitalId));
        }catch (Exception e){
            response.setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return response;
    }

    @ResponseBody
    @RequestMapping(value = "/getDoctors",method = RequestMethod.GET)
    public ResponseObject getDoctors(){
        ResponseObject response = ResponseObject.create();
        try {
            response.setData(doctorService.getDoctors());
        }catch (Exception e){
            response.setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return response;
    }

}

