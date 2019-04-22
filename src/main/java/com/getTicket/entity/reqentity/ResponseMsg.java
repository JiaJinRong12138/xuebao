package com.getTicket.entity.reqentity;

import com.getTicket.enums.Code;

import java.util.Date;

public class ResponseMsg {

    private int code;
    private String msg;
    private Object data;
    private Date date;

    public ResponseMsg(Code code) {

        this.code = code.getCode();
        this.msg = code.getMsg();
        this.date = code.getDate();

    }

    public ResponseMsg(Code code, Object data) {
        this(code);
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ResponseMsg{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                ", date=" + date +
                '}';
    }
}
