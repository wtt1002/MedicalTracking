package lab.c505.controller;

import lab.c505.dto.InspectionTimeDto;
import lab.c505.service.InspectionService;
import lab.c505.utils.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 医学图像检查结论
 * @author zxp
 * @date 2019-5-31
 */

@Controller
@RequestMapping("/inspection")
public class InspectionController {

    /**
     * 查询医学图像检查相关结论
     * @param medicalHistoryId
     * @param examIndex
     * @return
     */

    @Autowired
    private InspectionService inspectionService;

    @ResponseBody
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ResponseObject getInspections(@RequestParam(value = "medicalHistoryId") String medicalHistoryId,
                                        @RequestParam(value = "examIndex") Integer examIndex) {
        ResponseObject responseObject = ResponseObject.create();
        try {
            responseObject.setData(inspectionService.getInspections(medicalHistoryId, examIndex));
        } catch (Exception e) {
            responseObject.setMsg(e.getMessage()).setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return responseObject;
    }

    /**
     * 添加医学图像检查相关结论
     * @param inspectionTimeDto
     * @return
     */

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseObject addInspections(@RequestBody InspectionTimeDto inspectionTimeDto) {
        ResponseObject responseObject = ResponseObject.create();
        try {
            responseObject.setData(inspectionService.addInspection(inspectionTimeDto));
        } catch (Exception e) {
            responseObject.setMsg(e.getMessage()).setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return responseObject;
    }

    /**
     * 更新医学图像检查相关结论
     * @param inspectionTimeDto
     * @return
     */

    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseObject updateInspections(@RequestBody InspectionTimeDto inspectionTimeDto) {
        ResponseObject responseObject = ResponseObject.create();
        try {
            responseObject.setData(inspectionService.updateInspection(inspectionTimeDto));
        } catch (Exception e) {
            responseObject.setMsg(e.getMessage()).setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return responseObject;
    }
}
