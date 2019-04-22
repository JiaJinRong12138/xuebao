package com.getTicket.web;

import com.getTicket.entity.reqentity.ReqUserInfo;
import com.getTicket.entity.reqentity.ResponseMsg;
import com.getTicket.enums.Code;
import com.getTicket.service.LoginServer_;
import com.getTicket.utils.LoggerUtil;
import com.getTicket.utils.TokenUtil;
import com.getTicket.utils.exception.NullUserException;
import com.getTicket.utils.exception.PasswordException;
import com.getTicket.utils.exception.UsernameException;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

//相当于 Conntroller + ResponseBody
@RestController
@RequestMapping(value = "/service")
public class LoginAPI {

    private ResponseMsg responseMsg = null;
    @Autowired
    private LoginServer_ loginServer_;

    @PostMapping(value = "/")

    @PostMapping(value = "/login", consumes = "application/json")
    public ResponseMsg login(@RequestBody ReqUserInfo reqUserInfo){

        /**
         * token不为null,进行token判断
         * token为null, 进行登陆
         */
        String token = reqUserInfo.getToken();
        responseMsg = null;
        if(token == null) {
            //token 是 null
            LoggerUtil.getLogger().info("【INFO】:登陆API被调用" + reqUserInfo.toString());
            try {
                LoggerUtil.getLogger().info("【INFO】：" + loginServer_.isLogin(reqUserInfo));
                responseMsg = new ResponseMsg(Code.SUCCESS, loginServer_.getUserInfo_());
            } catch (UsernameException e) {
                LoggerUtil.getLogger().info(e.getMessage() + e.getCode());
                responseMsg = new ResponseMsg(e.getCode(), e.getMessage());
            } catch (PasswordException e) {
                LoggerUtil.getLogger().info(e.getMessage() + e.getCode());
                responseMsg = new ResponseMsg(e.getCode(), e.getMessage());
            } catch (NullUserException e) {
                LoggerUtil.getLogger().info(e.getMessage() + e.getCode());
                responseMsg = new ResponseMsg(e.getCode(), e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            try {
                if ((reqUserInfo.getUsername()).equals(TokenUtil.getUserIdFromRequest(token))) {
                    responseMsg = new ResponseMsg(Code.ISLOGINED, "【INFO】已经登陆");
                }
            } catch (NullPointerException e){
                responseMsg = new ResponseMsg(Code.TOKENERROR, "【INFO】:token错误，无权访问");
            }
        }
        return responseMsg;
    }

    @GetMapping("/test")
    public String demo(HttpServletRequest request){

        Cookie[] cookie = request.getCookies();

        HttpSession sessoin=request.getSession();//这就是session的创建
        sessoin.setAttribute("username","TOM");//给session添加属性属性name： username,属性 value：TOM
        sessoin.setAttribute("password","tommmm");//添加属性 name: password; value: tommmm
        System.out.println(sessoin.getAttribute("username"));
        return "http://127.0.0.1:8080/";
    }

}
