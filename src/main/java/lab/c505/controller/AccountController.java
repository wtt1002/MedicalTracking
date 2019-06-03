package lab.c505.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import lab.c505.dto.AccountInfoDto;
import lab.c505.dto.DoctorBriefInfoDto;
import lab.c505.dto.UserDetailDto;
import lab.c505.entity.Account;
import lab.c505.entity.Doctor;
import lab.c505.service.AccountService;
import lab.c505.service.DoctorService;
import lab.c505.utils.RequestObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import lab.c505.utils.ResponseObject;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 账户表 前端控制器
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
//@Controller
@RestController
@RequestMapping("/user")
public class AccountController {

    @Autowired
    AccountService accountService;

    @Autowired
    DoctorService doctorService;

    /**
     * 登录
     * @param params
     * @return ResponseObject
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseObject login(@RequestBody Map<String, Object> params) throws Exception{
        ResponseObject response = ResponseObject.create();
        UserDetailDto doctorDetailDto = new UserDetailDto();
        if (params != null && params.get("username") != null && params.get("password") != null){
            Account account = accountService.checkLogin((String) params.get("username"), (String) params.get("password"));
            if (account != null && account.getDoctorId() != null){
                doctorDetailDto.setAccount(account);
                doctorDetailDto.setDocName(doctorService.getDocNameById(account.getDoctorId()));
            }else {
                response.setMsg("用户名或密码错误。");
                response.setCode("0003");
            }
        }else {
            response.setMsg("参数错误");
            response.setCode("0001");
        }
        response.setData(doctorDetailDto).encode();
        return response;
    }
//    @ResponseBody
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public ResponseObject login() throws Exception{
//        System.out.println("22222222222222222222222222222222222222222");
//        ResponseObject response = ResponseObject.create();
//        response.setData("zhangqiang");
//        return response;
//    }
    @ResponseBody
    @RequestMapping(value = "/login{username}", method = RequestMethod.GET)
    public ResponseObject login(@RequestParam(value = "username") String username) throws Exception{
        System.out.println("33333333333333333333333333333333333333333");
        System.out.println("username...."+username);
        ResponseObject response = ResponseObject.create();
        response.setData("zhangqiang");
        response.encode();
        return response;
    }

    /**
     * 添加账号
     * @param account
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseObject addAccount(@RequestBody Account account){
        ResponseObject responseObject = ResponseObject.create();
        try{

            responseObject.setMsg("插入成功").setData(accountService.addAccount(account));
        }catch (Exception e){
            e.printStackTrace();
            responseObject.setCode(ResponseObject.CODE_SYSTEMERROR).setMsg("插入失败");
        }
        return responseObject;
    }
    /**
     * 更新医生信息
     * @param account
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ResponseObject updateAccount(@RequestBody Account account){
        ResponseObject responseObject = ResponseObject.create();
        try{

            responseObject.setMsg("更新成功").setData(accountService.updateAccount(account));
        }catch (Exception e){
            e.printStackTrace();
            responseObject.setCode(ResponseObject.CODE_SYSTEMERROR).setMsg("更新失败");
        }
        return responseObject;
    }

    /**
     * 删除账户信息
     * @param accountId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public ResponseObject deleteAccount(@RequestParam(value = "accountId") String accountId){
        ResponseObject responseObject = ResponseObject.create();
        try{
            accountService.deleteAccount(accountId);
            responseObject.setMsg("删除成功");
        }catch (Exception e){
            e.printStackTrace();
            responseObject.setCode(ResponseObject.CODE_SYSTEMERROR).setMsg("删除失败");
        }
        return responseObject;
    }
    /**
     * 分页查询医生信息
     * @param params
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public ResponseObject getPatientList(@RequestBody Map<String, Object> params){
        ResponseObject response = ResponseObject.create();

        try {
            List<AccountInfoDto> list = accountService.queryAccounts((Integer) params.get("page"), (Integer) params.get("count"), (String) params.get("filter"));

            response.setData(list).setMsg("查询成功");
        } catch (Exception e){
            e.printStackTrace();
            response.setData(e.getMessage()).setCode(ResponseObject.CODE_VALIDERROR).setMsg("查询失败");
        }
        return response;
    }

}

