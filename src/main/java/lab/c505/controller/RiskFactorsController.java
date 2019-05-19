package lab.c505.controller;

import lab.c505.entity.RiskFactors;
import lab.c505.service.RiskFactorsService;
import lab.c505.utils.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 随访详情危险因素 前端控制器
 * </p>
 *
 * @author zxp
 * @since 2019-5-19
 */
@Controller
@RequestMapping("/riskFactors")
public class RiskFactorsController {
    @Autowired
    private RiskFactorsService riskFactorsService;

    /**
     * 查询单个患者的危险因素
     * @param rishFactorsId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public ResponseObject getSingleRiskFactors(@RequestParam(value = "rishFactorsId") String rishFactorsId) {
        ResponseObject responseObject = ResponseObject.create();
        try{
            responseObject.setData(riskFactorsService.getRiskFactors(rishFactorsId))
                    .setMsg("查询成功");
        }catch (Exception e){
            e.printStackTrace();
            responseObject.setMsg("查询失败").setCode(ResponseObject.CODE_PARAMERROR);
        }

        return responseObject;
    }
    /**
     * 新增单个患者的危险因素
     * @param riskFactors
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseObject addRiskFactors(@RequestBody RiskFactors riskFactors) {
        ResponseObject responseObject = ResponseObject.create();
        try{
            responseObject.setData(riskFactorsService.addRiskFactors(riskFactors))
                    .setMsg("插入成功");
        }catch (Exception e){
            e.printStackTrace();
            responseObject.setMsg("插入失败").setCode(ResponseObject.CODE_PARAMERROR);
        }
        return responseObject;
    }

    /**
     * 更新单个患者的危险因素
     * @param riskFactors
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseObject updateRiskFactors(@RequestBody RiskFactors riskFactors) {
        ResponseObject responseObject = ResponseObject.create();
        try{
            responseObject.setData(riskFactorsService.updateRiskFactors(riskFactors))
                    .setMsg("更新成功");
        }catch (Exception e){
            e.printStackTrace();
            responseObject.setMsg("更新失败").setCode(ResponseObject.CODE_PARAMERROR);
        }
        return responseObject;
    }
}
