package com.getTicket.entity;

public class Ticket_User_Info_ {
    /**
     * 用户是否抢到学报
     */
    private String username;        //用户名
    private Double weight_;         //全职
    private Integer listen_num;     //听学报的次数

    public Ticket_User_Info_() {
    }

    public Ticket_User_Info_(String username, Double weight_, Integer listen_num) {
        this.username = username;
        this.weight_ = weight_;
        this.listen_num = listen_num;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getWeight_() {
        return weight_;
    }

    public void setWeight_(Double weight_) {
        this.weight_ = weight_;
    }

    public Integer getListen_num() {
        return listen_num;
    }

    public void setListen_num(Integer listen_num) {
        this.listen_num = listen_num;
    }

    @Override
    public String toString() {
        return "Ticket_User_Info_{" +
                "username='" + username + '\'' +
                ", weight_=" + weight_ +
                ", listen_num=" + listen_num +
                '}';
    }
}
