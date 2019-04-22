package com.getTicket.utils;

import org.springframework.util.DigestUtils;

public class Md5 {

    public static String setPasswordByMd5(String password) {
        return DigestUtils.md5DigestAsHex(password.getBytes());
    }
}
