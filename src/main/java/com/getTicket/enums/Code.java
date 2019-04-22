package com.getTicket.enums;

import java.util.Date;

public enum Code {

    SUCCESS(100, "success", new Date()),
    WARNING(101, "存在问题", new Date()),
    ISLOGINED(107, "已经登陆", new Date()),
    TOKENERROR(201, "Token错误，无权限访问", new Date()),
    ERROR(-1, "fail", new Date()),
    NULLUSER(400, "用户不存在", new Date()),
    USERNAMEERROR(401, "账号错误", new Date()),
    PASSWORDERROR(402, "密码错误", new Date());

    private int code;
    private String msg;
    private Date date;

    Code(int code, String msg, Date date) {
        this.code = code;
        this.msg = msg;
        this.date = date;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Date getDate() {
        return date;
    }
}
