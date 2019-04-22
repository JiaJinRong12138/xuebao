package com.getTicket.utils.exception;

import com.getTicket.enums.Code;

public class NullUserException extends NullPointerException {

    private Code code;

    public NullUserException(String s, Code code) {
        super(s);
        this.code = code;
    }

    public Code getCode() {
        return code;
    }
}
