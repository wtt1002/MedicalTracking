package lab.c505.controller;


import lab.c505.entity.Doctor;
import lab.c505.service.DoctorService;
import lab.c505.utils.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

}

