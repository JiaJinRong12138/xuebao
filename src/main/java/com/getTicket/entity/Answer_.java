package com.getTicket.entity;

import java.util.Date;

public class Answer_ {
    /**
     * 答案实体类
     */
    private String username;        //用户id
    private String answer_id;       //回答id
    private String answer;          //回答内容
    private Date answer_time;      //回答时间

    public Answer_() {
    }

    public Answer_(String username, String answer_id, String answer, Date answer_time) {
        this.username = username;
        this.answer_id = answer_id;
        this.answer = answer;
        this.answer_time = answer_time;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(String answer_id) {
        this.answer_id = answer_id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getAnswer_time() {
        return answer_time;
    }

    public void setAnswer_time(Date answer_time) {
        this.answer_time = answer_time;
    }

    @Override
    public String toString() {
        return "Answer_{" +
                "username='" + username + '\'' +
                ", answer_id='" + answer_id + '\'' +
                ", answer='" + answer + '\'' +
                ", answer_time=" + answer_time +
                '}';
    }
}
