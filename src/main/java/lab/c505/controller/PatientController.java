package lab.c505.controller;


import lab.c505.entity.Patient;
import lab.c505.service.PatientService;
import lab.c505.utils.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 患者信息表 前端控制器
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19Integer page, Integer count, String fliter
 */
@Controller
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    PatientService patientService;

    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public ResponseObject getPatientList(@RequestBody Map<String, Object> params){
        ResponseObject response = ResponseObject.create();
        List<Patient> list;
        try {
            System.out.println(params);
            System.out.println(params.get("page"));

            list = patientService.getPatientsByPage((Integer) params.get("page"), (Integer) params.get("count"), (String) params.get("filter"));
            System.out.println(list.toString());
            response.setData(list).encode().setCode(ResponseObject.CODE_SUCCESS);
        }catch (IllegalArgumentException e){
            response.setData(e.getMessage()).setCode(ResponseObject.CODE_PARAMERROR).setMsg(e.getMessage());
        } catch (Exception e){
            e.printStackTrace();
            response.setData(e.getMessage()).setCode(ResponseObject.CODE_VALIDERROR).setMsg(e.getMessage());
        }
        return response;
    }
}

