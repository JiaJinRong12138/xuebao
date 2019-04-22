package com.getTicket.entity;

import java.util.Date;

public class Presentation_info_ {
    /**
     * 学报信息
     */

    private Integer id;          //学报id
    private Integer frequency;  //学报期数
    private String topic;       //主题
    private String speaker;     //主讲人
    private String speaker_head;//主讲人头像
    private String speaker_post;//主讲人职务
    private String address;     //学报举行地点
    private Date time;          //学报举行时间
    private Integer type;        //学报类型
    private Integer status;     //学报状态

    public Presentation_info_() {
    }

    public Presentation_info_(Integer id, Integer frequency, String topic, String speaker, String speaker_head, String speaker_post, String address, Date time, Integer type, Integer status) {
        this.id = id;
        this.frequency = frequency;
        this.topic = topic;
        this.speaker = speaker;
        this.speaker_head = speaker_head;
        this.speaker_post = speaker_post;
        this.address = address;
        this.time = time;
        this.type = type;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public String getSpeaker_head() {
        return speaker_head;
    }

    public void setSpeaker_head(String speaker_head) {
        this.speaker_head = speaker_head;
    }

    public String getSpeaker_post() {
        return speaker_post;
    }

    public void setSpeaker_post(String speaker_post) {
        this.speaker_post = speaker_post;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Presentation_info_{" +
                "id=" + id +
                ", frequency=" + frequency +
                ", topic='" + topic + '\'' +
                ", speaker='" + speaker + '\'' +
                ", speaker_head='" + speaker_head + '\'' +
                ", speaker_post='" + speaker_post + '\'' +
                ", address='" + address + '\'' +
                ", time=" + time +
                ", type=" + type +
                ", status=" + status +
                '}';
    }
}
