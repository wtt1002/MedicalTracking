package lab.c505.controller;


import lab.c505.entity.FollowSickHistory;
import lab.c505.service.FollowSickHistoryService;
import lab.c505.utils.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 随访病史表，从出院到此次随访为止，出现的所有病史 前端控制器
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Controller
@RequestMapping("/followSickHistory")
public class FollowSickHistoryController {

    @Autowired
    FollowSickHistoryService followSickHistoryService;

    /**
     * 查询单个患者的出院病史
     * @param fshId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public ResponseObject getSingleFollowUpDetail(@RequestParam(value = "followSickhistoryId") String fshId) {
        ResponseObject responseObject = ResponseObject.create();
        try{
            responseObject.setData(followSickHistoryService.getFollowSickHistory(fshId))
                    .setMsg("查询成功");
        }catch (Exception e){
            e.printStackTrace();
            responseObject.setMsg("查询失败").setCode(ResponseObject.CODE_PARAMERROR);
        }

        return responseObject;
    }
    /**
     * 新增单个患者的出院病史
     * @param followSickHistory
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseObject addFollowUpDetail(@RequestBody FollowSickHistory followSickHistory) {
        ResponseObject responseObject = ResponseObject.create();
        try{
            responseObject.setData(followSickHistoryService.addFollowSickHistory(followSickHistory))
                    .setMsg("插入成功");
        }catch (Exception e){
            e.printStackTrace();
            responseObject.setMsg("插入失败").setCode(ResponseObject.CODE_PARAMERROR);
        }
        return responseObject;
    }

    /**
     * 更新单个患者的出院病史
     * @param followSickHistory
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseObject updateFollowUpDetail(@RequestBody FollowSickHistory followSickHistory) {
        ResponseObject responseObject = ResponseObject.create();
        try{
            responseObject.setData(followSickHistoryService.updateFollowSickHistory(followSickHistory))
                    .setMsg("更新成功");
        }catch (Exception e){
            e.printStackTrace();
            responseObject.setMsg("更新失败").setCode(ResponseObject.CODE_PARAMERROR);
        }
        return responseObject;
    }
}

