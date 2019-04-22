package com.getTicket.entity;

public class Question_Answer_ {
    /**
     * 对某个问题进行回答
     */

    private Integer question_id;    //问题id
    private Integer answer_id;      //答案id

    public Question_Answer_() {
    }

    public Question_Answer_(Integer question_id, Integer answer_id) {
        this.question_id = question_id;
        this.answer_id = answer_id;
    }

    public Integer getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(Integer question_id) {
        this.question_id = question_id;
    }

    public Integer getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(Integer answer_id) {
        this.answer_id = answer_id;
    }

    @Override
    public String toString() {
        return "Question_Answer_{" +
                "question_id=" + question_id +
                ", answer_id=" + answer_id +
                '}';
    }
}
