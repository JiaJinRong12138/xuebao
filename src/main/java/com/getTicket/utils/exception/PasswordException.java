package com.getTicket.utils.exception;

import com.getTicket.enums.Code;

public class PasswordException extends Exception {

    private Code code;

    public PasswordException(String message, Code code) {
        super(message);
        this.code = code;
    }

    public Code getCode() {
        return code;
    }
}
