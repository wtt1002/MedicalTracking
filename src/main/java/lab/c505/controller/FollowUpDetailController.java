package lab.c505.controller;

import lab.c505.dto.FollowUpDetailDto;
import lab.c505.service.FollowUpDetailService;
import lab.c505.utils.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author zxp
 * @since 2019-5-17
 * @do 随访详情相关的接口
 */

@Controller
@RequestMapping("/followUpDetail")
public class FollowUpDetailController {

    @Autowired
    private FollowUpDetailService followUpDetailService;

    /**
     * 查询单个患者的随访详情
     * @param followUpId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/query{followUpId}", method = RequestMethod.GET)
    public ResponseObject getSingleFollowUpDetail(@RequestParam(value = "followUpId") String followUpId) {
        ResponseObject responseObject = ResponseObject.create();
        try{
            responseObject.setData(followUpDetailService.getOneFuDetail(followUpId))
            .setMsg("查询成功");
        }catch (Exception e){
            e.printStackTrace();
            responseObject.setMsg("查询失败").setCode(ResponseObject.CODE_PARAMERROR);
        }

        return responseObject;
    }

    /**
     * 新增单个患者的随访详情
     * @param followUpDetailDto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseObject addFollowUpDetail(@RequestBody FollowUpDetailDto followUpDetailDto) {
        ResponseObject responseObject = ResponseObject.create();
        try{
            responseObject.setData(followUpDetailService.addFuDetail(followUpDetailDto))
                    .setMsg("插入成功");
        }catch (Exception e){
            e.printStackTrace();
            responseObject.setMsg("插入失败").setCode(ResponseObject.CODE_PARAMERROR);
        }
        return responseObject;
    }

    /**
     * 更新单个患者的随访详情
     * @param followUpDetailDto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseObject updateFollowUpDetail(@RequestBody FollowUpDetailDto followUpDetailDto) {
        ResponseObject responseObject = ResponseObject.create();
        try{
            responseObject.setData(followUpDetailService.updateFuDetail(followUpDetailDto))
                    .setMsg("更新成功");
        }catch (Exception e){
            e.printStackTrace();
            responseObject.setMsg("更新失败").setCode(ResponseObject.CODE_PARAMERROR);
        }
        return responseObject;
    }
}
