package lab.c505.controller;

import lab.c505.entity.FollowPhysicalExam;
import lab.c505.service.FollowPhysicalExamService;
import lab.c505.utils.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 随访体检表 前端控制器
 * </p>
 *
 * @author Liu Chenglong
 * @since 2019-05-06
 */
@Controller
@RequestMapping("/followPhysicalExam")
public class FollowPhysicalExamController {
    @Autowired
    private FollowPhysicalExamService followPhysicalExamService;

    @ResponseBody
    @RequestMapping(value = "/getFollowPhysicalExam{followUpId}", method = RequestMethod.GET)
    public ResponseObject getOnePatient(@RequestParam(value = "followUpId") String followUpId) {
        ResponseObject responseObject = ResponseObject.create();
        try {
            FollowPhysicalExam followPhysicalExam = followPhysicalExamService.getFollowPhysicalExam(followUpId);
            responseObject.setData(followPhysicalExam).encode();
        } catch (Exception e) {
            responseObject.setMsg(e.getMessage()).setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return responseObject;
    }

    @ResponseBody
    @RequestMapping(value = "/addFollowPhysicalExam", method = RequestMethod.POST)
    public ResponseObject addFollowPhysicalExam(@RequestBody FollowPhysicalExam followPhysicalExam) {
        ResponseObject responseObject = ResponseObject.create();
        try {
            followPhysicalExamService.addFollowPhysicalExam(followPhysicalExam);
            responseObject.setData(followPhysicalExam);
        } catch (Exception e) {
            responseObject.setMsg(e.getMessage()).setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return responseObject;
    }

    @ResponseBody
    @RequestMapping(value = "/updateFollowPhysicalExam", method = RequestMethod.POST)
    public ResponseObject updateFollowPhysicalExam(@RequestBody FollowPhysicalExam followPhysicalExam) {
        ResponseObject responseObject = ResponseObject.create();
        try {
            followPhysicalExamService.updateFollowPhysicalExam(followPhysicalExam);
            responseObject.setData(followPhysicalExam);
        } catch (Exception e) {
            responseObject.setMsg(e.getMessage()).setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return responseObject;
    }
}

