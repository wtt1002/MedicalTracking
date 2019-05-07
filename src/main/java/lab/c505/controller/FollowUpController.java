package lab.c505.controller;

import lab.c505.entity.FollowUp;
import lab.c505.service.FollowUpService;
import lab.c505.utils.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 * 随访表，记录随访的计划与实际时间，随访患者与医生等信息 前端控制器
 * </p>
 *
 * @author Liu Chenglong
 * @since 2019-05-06
 */
@Controller
@RequestMapping("/followUp")
public class FollowUpController {
    @Autowired
    private FollowUpService followUpService;

    @ResponseBody
    @RequestMapping(value = "/getFollowUp{medicalHistoryId}{page}{count}", method = RequestMethod.GET)
    public ResponseObject getOnePatient(@RequestParam(value = "medicalHistoryId") String medicalHistoryId,
                                        @RequestParam(value = "page") Integer page,
                                        @RequestParam(value = "count") Integer count) {
        ResponseObject responseObject = ResponseObject.create();
        try {
            System.out.print(medicalHistoryId + page + count);
            List<FollowUp> followUps = followUpService.getFollowUp(medicalHistoryId, page, count);
            responseObject.setData(followUps).encode();
        } catch (Exception e) {
            responseObject.setMsg(e.getMessage()).setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return responseObject;
    }

    @ResponseBody
    @RequestMapping(value = "/addFollowUp", method = RequestMethod.POST)
    public ResponseObject addPci(@RequestBody FollowUp followUp) {
        ResponseObject responseObject = ResponseObject.create();
        try {
            followUpService.addFollowUp(followUp);
            responseObject.setData(followUp);
        } catch (Exception e) {
            responseObject.setMsg(e.getMessage()).setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return responseObject;
    }

    @ResponseBody
    @RequestMapping(value = "/updateFollowUp", method = RequestMethod.POST)
    public ResponseObject updatePci(@RequestBody FollowUp followUp) {
        ResponseObject responseObject = ResponseObject.create();
        try {
            followUpService.updateFollowUp(followUp);
            responseObject.setData(followUp);
        } catch (Exception e) {
            responseObject.setMsg(e.getMessage()).setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return responseObject;
    }
}

