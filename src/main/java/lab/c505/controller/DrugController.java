package lab.c505.controller;


import lab.c505.dto.DrugAndUseageDto;
import lab.c505.dto.QueryDrugDto;
import lab.c505.entity.FollowDrugUsage;
import lab.c505.service.DrugService;
import lab.c505.utils.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 * 药物表 前端控制器
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@RestController
@RequestMapping("/drug")
public class DrugController {

    @Autowired
    private DrugService drugService;

    /**
     * 查询已用药物
     * @param medicalHistoryId
     * @return ResponseObject
     */
    @RequestMapping(value = "/usage{medicalHistoryId}", method = RequestMethod.GET)
    public ResponseObject getDrugUsage(@RequestParam(value = "medicalHistoryId") String medicalHistoryId){
        ResponseObject response = ResponseObject.create();
        try {
            response.setData(drugService.queryDrugList(medicalHistoryId)).setMsg("查询成功");
        }catch (Exception e){
            e.printStackTrace();
            response.setMsg("查询失败").setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return response;
    }

    /**
     * 添加药物
     * @param queryDrugDtoList
     * @return ResponseObject
     */
    @RequestMapping(value = "/usage/add", method = RequestMethod.POST)
    public ResponseObject addDrugUsage(@RequestBody List<QueryDrugDto> queryDrugDtoList){
        ResponseObject response = ResponseObject.create();
        try {
            response.setData(drugService.insertDrugList(queryDrugDtoList)).setMsg("添加成功");
        }catch (Exception e){
            e.printStackTrace();
            response.setMsg("添加失败").setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return response;
    }

    /**
     * 更新药物
     * @param drugAndUseageDto
     * @return ResponseObject
     */
    @RequestMapping(value = "/usage/update", method = RequestMethod.POST)
    public ResponseObject updateDrugUsage(@RequestBody DrugAndUseageDto drugAndUseageDto){
        ResponseObject response = ResponseObject.create();
        try {
            response.setData(drugService.updateDrug(drugAndUseageDto)).setMsg("更新成功");
        }catch (Exception e){
            e.printStackTrace();
            response.setMsg("更新失败").setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return response;
    }

    @RequestMapping(value = "/usage/delete", method = RequestMethod.POST)
    public ResponseObject deleteDrugUsage(@RequestBody FollowDrugUsage followDrugUsage){
        ResponseObject response = ResponseObject.create();
        try {
            drugService.deleteDrug(followDrugUsage);
            response.setMsg("删除成功");
        }catch (Exception e){
            e.printStackTrace();
            response.setMsg("添加失败").setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return response;
    }
}

