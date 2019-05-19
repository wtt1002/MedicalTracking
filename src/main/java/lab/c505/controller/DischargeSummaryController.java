package lab.c505.controller;

import lab.c505.dto.DischargeExamItemDto;
import lab.c505.dto.DischargeExamItemsDto;
import lab.c505.dto.DischargeSummaryDto;
import lab.c505.dto.ScoreAndVapDto;
import lab.c505.entity.Score;
import lab.c505.entity.VascularAccessProblem;
import lab.c505.service.DischargeSummaryService;
import lab.c505.utils.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
            responseObject.setData(dischargeSummaryDto);
        } catch (Exception e) {
            responseObject.setMsg(e.getMessage()).setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return responseObject;
    }

    @ResponseBody
    @RequestMapping(value = "/addDischargeExamItems", method = RequestMethod.POST)
    public ResponseObject addDischargeExamItems(@RequestBody DischargeExamItemsDto dischargeExamItemsDto) {
        ResponseObject responseObject = ResponseObject.create();
        try {
            List<DischargeExamItemDto> dischargeExamItemDtos = dischargeExamItemsDto.getDischargeExamItemDtos();
            dischargeSummaryService.addDischargeExamItems(dischargeExamItemDtos);
        } catch (Exception e) {
            responseObject.setMsg(e.getMessage()).setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return responseObject;
    }

    @ResponseBody
    @RequestMapping(value = "/addScoreAndVap", method = RequestMethod.POST)
    public ResponseObject addScoreAndVap(@RequestBody ScoreAndVapDto scoreAndVapDto) {
        ResponseObject responseObject = ResponseObject.create();
        try {
            dischargeSummaryService.addScoreAndVap(scoreAndVapDto);
        } catch (Exception e) {
            responseObject.setMsg(e.getMessage()).setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return responseObject;
    }

    @ResponseBody
    @RequestMapping(value = "/updateDischargeExamItems", method = RequestMethod.POST)
    public ResponseObject updateDischargeExamItems(@RequestBody DischargeExamItemsDto dischargeExamItemsDto) {
        ResponseObject responseObject = ResponseObject.create();
        try {
            List<DischargeExamItemDto> dischargeExamItemDtos = dischargeExamItemsDto.getDischargeExamItemDtos();
            dischargeSummaryService.updateDischargeExamItems(dischargeExamItemDtos);
        } catch (Exception e) {
            responseObject.setMsg(e.getMessage()).setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return responseObject;
    }

    @ResponseBody
    @RequestMapping(value = "/updateScoreAndVap", method = RequestMethod.POST)
    public ResponseObject updateScoreAndVap(@RequestBody ScoreAndVapDto scoreAndVapDto) {
        ResponseObject responseObject = ResponseObject.create();
        try {
            dischargeSummaryService.updateScoreAndVap(scoreAndVapDto);
        } catch (Exception e) {
            responseObject.setMsg(e.getMessage()).setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return responseObject;
    }

    /**
     * 添加评分
     * @param score
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addScore", method = RequestMethod.POST)
    public ResponseObject addScore(@RequestBody Score score) {
        ResponseObject responseObject = ResponseObject.create();
        try {
            responseObject.setData(dischargeSummaryService.insertScore(score))
                    .setMsg("插入成功");
        } catch (Exception e) {
            responseObject.setMsg(e.getMessage()).setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return responseObject;
    }

    /**
     * 添加血管入路并发症
     * @param vas
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addVas", method = RequestMethod.POST)
    public ResponseObject addVas(@RequestBody VascularAccessProblem vas) {
        ResponseObject responseObject = ResponseObject.create();
        try {
            responseObject.setData(dischargeSummaryService.insertVascularAccessProblem(vas))
                    .setMsg("插入成功");
        } catch (Exception e) {
            responseObject.setMsg(e.getMessage()).setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return responseObject;
    }

    /**
     * 更新评分
     * @param score
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateScore", method = RequestMethod.POST)
    public ResponseObject updateScore(@RequestBody Score score) {
        ResponseObject responseObject = ResponseObject.create();
        try {
            responseObject.setData(dischargeSummaryService.updateScore(score))
                    .setMsg("更新成功");
        } catch (Exception e) {
            responseObject.setMsg(e.getMessage()).setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return responseObject;
    }

    /**
     * 更新血管入路并发症
     * @param vas
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateVas", method = RequestMethod.POST)
    public ResponseObject updateVas(@RequestBody VascularAccessProblem vas) {
        ResponseObject responseObject = ResponseObject.create();
        try {
            responseObject.setData(dischargeSummaryService.updateVascularAccessProblem(vas))
                    .setMsg("更新成功");
        } catch (Exception e) {
            responseObject.setMsg(e.getMessage()).setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return responseObject;
    }
}
