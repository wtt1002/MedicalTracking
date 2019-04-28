package lab.c505.controller;


import lab.c505.dto.UserDetailDto;
import lab.c505.entity.Account;
import lab.c505.service.AccountService;
import lab.c505.service.DoctorService;
import lab.c505.utils.RequestObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import lab.c505.utils.ResponseObject;

import javax.servlet.http.HttpSession;
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

}

