package lab.c505.controller;


import lab.c505.entity.FollowSideEffects;
import lab.c505.service.FollowSideEffectsService;
import lab.c505.utils.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 随访药物不良反应表 前端控制器
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Controller
@RequestMapping("/followSideEffects")
public class FollowSideEffectsController {

    @Autowired
    private FollowSideEffectsService followSideEffectsService;

    /**
     * 查询单个患者的不良反应
     * @param fseId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public ResponseObject getSingleFollowSideEffects(@RequestParam(value = "fseId") String fseId) {
        ResponseObject responseObject = ResponseObject.create();
        try{
            responseObject.setData(followSideEffectsService.getFsEffects(fseId))
                    .setMsg("查询成功");
        }catch (Exception e){
            e.printStackTrace();
            responseObject.setMsg("查询失败").setCode(ResponseObject.CODE_PARAMERROR);
        }

        return responseObject;
    }

    /**
     * 新增单个患者的不良反应
     * @param followSideEffects
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseObject addFollowSideEffects(@RequestBody FollowSideEffects followSideEffects) {
        ResponseObject responseObject = ResponseObject.create();
        try{
            responseObject.setData(followSideEffectsService.addFsEffects(followSideEffects))
                    .setMsg("插入成功");
        }catch (Exception e){
            e.printStackTrace();
            responseObject.setMsg("插入失败").setCode(ResponseObject.CODE_PARAMERROR);
        }
        return responseObject;
    }

    /**
     * 更新单个患者的不良反应
     * @param followSideEffects
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseObject updateFollowSideEffects(@RequestBody FollowSideEffects followSideEffects) {
        ResponseObject responseObject = ResponseObject.create();
        try{
            responseObject.setData(followSideEffectsService.updateFsEffects(followSideEffects))
                    .setMsg("更新成功");
        }catch (Exception e){
            e.printStackTrace();
            responseObject.setMsg("更新失败").setCode(ResponseObject.CODE_PARAMERROR);
        }
        return responseObject;
    }
}

