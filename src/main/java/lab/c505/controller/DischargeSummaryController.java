package lab.c505.controller;

import lab.c505.dto.DischargeSummaryDto;
import lab.c505.service.DischargeSummaryService;
import lab.c505.utils.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @package: lab.c505.controller
 * @description: 出院小结
 * @author: Liu Chenglong
 * @date: 2019-03-19 21:13
 **/
@Controller
@RequestMapping("/dischargeSummary")
public class DischargeSummaryController {
    @Autowired
    private DischargeSummaryService dischargeSummaryService;

    @ResponseBody
    @RequestMapping(value = "/get{medicalHistoryId}", method = RequestMethod.GET)
    public ResponseObject getOnePatient(@RequestParam(value = "medicalHistoryId") String medicalHistoryId) {
        ResponseObject responseObject = ResponseObject.create();
        try {
            DischargeSummaryDto dischargeSummaryDto = dischargeSummaryService.getDischargeSummary(medicalHistoryId);
            responseObject.setData(dischargeSummaryDto).encode();
        } catch (Exception e) {
            responseObject.setMsg(e.getMessage()).setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return responseObject;
    }
}
