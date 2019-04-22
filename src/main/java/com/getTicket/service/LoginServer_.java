package com.getTicket.service;

import com.getTicket.dao.Mapper;
import com.getTicket.entity.UserInfo_;
import com.getTicket.entity.reqentity.ReqUserInfo;
import com.getTicket.enums.Code;
import com.getTicket.utils.LoggerUtil;
import com.getTicket.utils.Md5;
import com.getTicket.utils.StringUtil;
import com.getTicket.utils.TokenUtil;
import com.getTicket.utils.exception.NullUserException;
import com.getTicket.utils.exception.PasswordException;
import com.getTicket.utils.exception.UsernameException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.zip.CheckedOutputStream;

@Service
public class LoginServer_ {

    private UserInfo_ userInfo_ = null;
    //实例化mapper
    @Autowired
    private Mapper mapper;

    public Boolean isLogin(ReqUserInfo rui) throws NullPointerException, UsernameException, PasswordException {


        // 判断字符串格式合法性
        System.out.println(StringUtil.usernameIsLegitimate(rui.getUsername()) && StringUtil.passwordIsLegitimate(rui.getPassword()));
        if(StringUtil.usernameIsLegitimate(rui.getUsername()) && StringUtil.passwordIsLegitimate(rui.getPassword())){
            //判断账号和密码是否正确
            //需要异常捕获
            UserInfo_ userInfo_ =  mapper.selectUserInfoByUsername(rui.getUsername());
            if(userInfo_ == null){
                throw new NullUserException("【info】:不存在该用户", Code.NULLUSER);
            }else {
                //账号密码判断
                if(rui.getUsername().equals(userInfo_.getUsername())){
                    //账号正确
                    if(Md5.setPasswordByMd5(rui.getPassword()).equals(userInfo_.getPassword())){
                        //密码正确
                        LoggerUtil.getLogger().info("【INFO】:登陆成功，生成token");
                        String token = TokenUtil.generateToken(userInfo_.getUsername());
                        userInfo_.setToken(token);
                        userInfo_.setPassword(null);
                        this.userInfo_ = userInfo_;
                        return true;
                    }
                }else{
                    //账号错误
                    LoggerUtil.getLogger().info("【INFO】:账号错误");
                    throw new UsernameException("【INFO】:账号错误", Code.USERNAMEERROR);
                }
            }
        }else{
            throw new UsernameException("【INFO】:账号错误", Code.USERNAMEERROR);
        }
        return false;
    }

    public UserInfo_ getUserInfo_() {
        return userInfo_;
    }
}
