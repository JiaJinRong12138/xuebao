package com.getTicket.entity;

import java.util.Date;

public class Question_ {
    /**
     * 问题实体类
     */

    private String username;        //用户id
    private String question_id;     //问题id
    private String question;        //问题内容
    private Date question_time;     //提问时间

    public Question_() {
    }

    public Question_(String username, String question_id, String question, Date question_time) {
        this.username = username;
        this.question_id = question_id;
        this.question = question;
        this.question_time = question_time;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(String question_id) {
        this.question_id = question_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Date getQuestion_time() {
        return question_time;
    }

    public void setQuestion_time(Date question_time) {
        this.question_time = question_time;
    }

    @Override
    public String toString() {
        return "Question_{" +
                "username='" + username + '\'' +
                ", question_id='" + question_id + '\'' +
                ", question='" + question + '\'' +
                ", question_time=" + question_time +
                '}';
    }
}
