package com.getTicket.entity;

public class User_Presentation_ {
    /**
     * 用户_学报——用户听过那些学报
     */
    private String username;        //用户id
    private Integer id;             //学报id
    private String experience;      //学报心得

    public User_Presentation_() {
    }

    public User_Presentation_(String username, Integer id, String experience) {
        this.username = username;
        this.id = id;
        this.experience = experience;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "User_Presentation_{" +
                "username='" + username + '\'' +
                ", id=" + id +
                ", experience='" + experience + '\'' +
                '}';
    }
}
