package com.getTicket.entity;

public class UserInfo_ {
    /**
     * 用户信息
     */

    private String username;    //用户id
    private String password;    //用户密码
    private String QQ;          //用户QQ --- 作为通知用户是否抢报成功
    private String head;        //用户图片路径
    private String name;        //用户密码
    private Integer sex;        //用户性别
    private String class_;      //用户班级
    private Integer major;       //用户班级
    private Integer listen_num; //用户听学报次数
    private Double weight_;     //权重

    private String token;       //token

    public UserInfo_() {
    }

    public UserInfo_(String username, String password, String QQ, String head, String name, Integer sex, String class_, Integer major, Integer listen_num, Double weight_) {
        this.username = username;
        this.password = password;
        this.QQ = QQ;
        this.head = head;
        this.name = name;
        this.sex = sex;
        this.class_ = class_;
        this.major = major;
        this.listen_num = listen_num;
        this.weight_ = weight_;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getClass_() {
        return class_;
    }

    public void setClass_(String class_) {
        this.class_ = class_;
    }

    public Integer getMajor() {
        return major;
    }

    public void setMajor(Integer major) {
        this.major = major;
    }

    public Integer getListen_num() {
        return listen_num;
    }

    public void setListen_num(Integer listen_num) {
        this.listen_num = listen_num;
    }

    public Double getWeight_() {
        return weight_;
    }

    public void setWeight_(Double weight_) {
        this.weight_ = weight_;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "UserInfo_{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", QQ='" + QQ + '\'' +
                ", head='" + head + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", class_='" + class_ + '\'' +
                ", major=" + major +
                ", listen_num=" + listen_num +
                ", weight_=" + weight_ +
                ", token='" + token + '\'' +
                '}';
    }
}
