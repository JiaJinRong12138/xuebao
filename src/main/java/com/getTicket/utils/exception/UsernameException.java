package com.getTicket.utils.exception;

import com.getTicket.enums.Code;

public class UsernameException extends Exception {

    private Code code;

    public UsernameException(String message, Code code) {
        super(message);
        this.code = code;
    }

    public Code getCode() {
        return code;
    }
}
