package lab.c505.controller;

import lab.c505.entity.Pci;
import lab.c505.service.PciService;
import lab.c505.utils.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @package: lab.c505.controller
 * @description: 冠脉介入
 * @author: Liu Chenglong
 * @date: 2019-05-06 16:26
 **/
@Controller
@RequestMapping("/pci")
public class PciController {
    @Autowired
    private PciService pciService;

    @ResponseBody
    @RequestMapping(value = "/getPci{medicalHistoryId}", method = RequestMethod.GET)
    public ResponseObject getOnePatient(@RequestParam(value = "medicalHistoryId") String medicalHistoryId) {
        ResponseObject responseObject = ResponseObject.create();
        try {
            Pci pci = pciService.getPci(medicalHistoryId);
            responseObject.setData(pci).encode();
        } catch (Exception e) {
            responseObject.setMsg(e.getMessage()).setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return responseObject;
    }

    @ResponseBody
    @RequestMapping(value = "/addPci", method = RequestMethod.POST)
    public ResponseObject addPci(@RequestBody Pci pci) {
        ResponseObject responseObject = ResponseObject.create();
        try {
            pciService.addPci(pci);
        } catch (Exception e) {
            responseObject.setMsg(e.getMessage()).setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return responseObject;
    }

    @ResponseBody
    @RequestMapping(value = "/updatePci", method = RequestMethod.POST)
    public ResponseObject updatePci(@RequestBody Pci pci) {
        ResponseObject responseObject = ResponseObject.create();
        try {
            pciService.updatePci(pci);
        } catch (Exception e) {
            responseObject.setMsg(e.getMessage()).setCode(ResponseObject.CODE_SYSTEMERROR);
        }
        return responseObject;
    }
}
