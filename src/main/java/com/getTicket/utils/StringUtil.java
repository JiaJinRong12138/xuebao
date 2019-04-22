package com.getTicket.utils;

import javax.sql.rowset.serial.SerialBlob;
import java.io.UnsupportedEncodingException;
import java.sql.Blob;
import java.sql.SQLException;

public class StringUtil {

    /**
     * String 转 blob
     * @param str 待转换字符串
     * @return 返回Blob对象
     * @throws UnsupportedEncodingException
     * @throws SQLException
     */
    public static Blob toBlob(String str) throws UnsupportedEncodingException, SQLException {
        return new SerialBlob(str.getBytes("GBK"));
    }

    /**
     * Blob 转 String
     * @param b 待转换Blob对象
     * @return
     */
    public static String toString(Blob b) throws SQLException, UnsupportedEncodingException {
        return new String(b.getBytes(1, (int) b.length()), "GBK");
    }

    /**
     * 判断字符串内是否含有数字和字母
     * @param str
     * @return
     */
    public static Boolean passwordIsLegitimate(String password){
        /**
         * 密码长度大于6位，切含有字母和数字
         */
        if(password.length() >= 6) {
            String regex = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,15}$";
            return password.matches(regex);
        }
        return false;
    }

    public static Boolean usernameIsLegitimate(String username){
        /**
         * 账号小于8位，且全是数字
         */
        if(username.length() <= 8){
            String regex = "^[0-9]*$";
            return username.matches(regex);
        }
        return false;
    }
}
