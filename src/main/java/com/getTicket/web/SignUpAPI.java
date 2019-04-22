package com.getTicket.web;

import com.getTicket.entity.reqentity.ResponseMsg;
import com.getTicket.entity.reqentity.SignUpInfo;
import com.getTicket.service.LoginServer_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/service")
public class SignUpAPI {

    private ResponseMsg responseMsg = null;
    @Autowired
    private LoginServer_ loginServer_;

    @PostMapping(value = "/signup", consumes = "application/json")
    public ResponseMsg signUp(@RequestBody SignUpInfo signUpInfo){

        /**
         * 验证token,token正确执行报名的方法，token错误不执行
         */
        return null;
    }

}
