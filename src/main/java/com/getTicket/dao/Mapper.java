package com.getTicket.dao;

import com.getTicket.entity.*;
import com.mysql.cj.jdbc.Blob;
import com.sun.tools.javac.util.List;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@org.apache.ibatis.annotations.Mapper
public interface Mapper {

    /* ****************************************单表操作************************************************ */

    /*====================================DB_USERINFO_数据库操作======================================*/
    /**
     * 查询所有学生信息
     * @return 所有学生信息
     */
    @Select("select * from db_userinfo_")
    List<UserInfo_> selectAllUserInfo_();

    /**
     * 查询学生信息通过username
     * @param username 用户id
     * @return  userinfo
     */
    @Results(value = {
            @Result(property = "username", column = "username", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(property = "password", column = "password", jdbcType = JdbcType.VARCHAR),
            @Result(property = "QQ", column = "QQ", jdbcType = JdbcType.VARCHAR),
//            @Result(property = "head", column = "head", jdbcType = JdbcType.BLOB),
            @Result(property = "name", column = "name", jdbcType = JdbcType.VARCHAR),
            @Result(property = "sex", column = "sex", jdbcType = JdbcType.INTEGER),
            @Result(property = "class_", column = "class_", jdbcType = JdbcType.VARCHAR),
            @Result(property = "major", column = "major", jdbcType = JdbcType.INTEGER),
            @Result(property = "listen_num", column = "listen_num", jdbcType = JdbcType.INTEGER)
    })
    @Select("select * from db_userinfo_ where username = #{username}")
    UserInfo_ selectUserInfoByUsername(@Param("username") String username);

    /**
     * 更新用户信息表
     * @param userInfo_ 用户信息
     * @return 返回更新列数
     */
    @Update("update db_userinfo_ set password = #{userInfo_.password}, " +
            "QQ = #{userInfo_.QQ}, head = #{userInfo_.head}, name = #{userInfo_.name}," +
            "sex = #{userInfo_.sex}, class_ = #{userInfo_.class_}, major = #{userInfo_.major}," +
            "listen_num = #{userInfo_.listen_num}")
    int updateUserInfo(@Param("userInfo_") UserInfo_ userInfo_);


    /*====================================DB_PRESENTATION_INFO数据库操作======================================*/

    /**
     * 查询db_persentation_info_所有信息
     * @return  返回Presentation_info_的List集合
     */
    @Select("select * from db_persentation_info_")
    List<Presentation_info_> selectAllPresentationInfo();

    /**
     * 根据学报id查询学报信息
     * @param id 学报id
     * @return 学报信息实体类
     */
    @Select("select * from db_persentation_info_ where id = #{id}")
    Presentation_info_ selectPersentationInfoById(@Param("id") Integer id);


    /*=========================DB_USER_PRESENTATION_数据库操作=========================================================*/

    /**
     * 查询所有用户以及与之相关的学报信息和心得体会
     * @return
     */
    @Select("select * from db_user_presentation_")
    List<User_Presentation_> selectAllUserPresentation();

    /**
     * 通过用户id查询与该用户相关的学报信息和心得体会
     * @param username
     * @return User_Presentation_实体类
     */
    @Select("select * from db_user_presentation_ where username = #{username}")
    User_Presentation_ selectUserPresentationByUsername(@Param("username") String username);

    /**
     * 通过username更新与用户相关的学报信息以及心得体会
     * @param user_presentation_
     * @return 执行的行数
     */
    @Update("update db_user_presentation_ set id = #{user_presentation_.id}, " +
            "experience = #{user_presentation_.experience}")
    int updateUserPresentationByUsername(@Param("user_presentation_") User_Presentation_ user_presentation_);



    /*=========================DB_TICKET_USER_INFO_数据库操作=========================================================*/

    /**
     * 通过username查询用户是否抢到学报
     * @param username
     * @return 用户抢票是否成功的实体类
     */
    @Select("select * from db_ticket_user_info_ where username = #{username}")
    Ticket_User_Info_ selectAllTicketUserInfoByUsername(@Param("username") String username);

    /**
     * 通过usernam更新用户是否抢到票的状态
     * @param ticket_user_info_ 用户信息
     * @return 执行行数
     */
    @Update("update db_ticket_user_info_ set isgetticket = #{ticket_user_info_.isgetticket}" +
            "where username = #{ticket_user_info_.username}")
    int updateTicketUserInfoByUsername(@Param("ticket_user_info_") Ticket_User_Info_ ticket_user_info_);


    /*=========================DB_QUESTION_数据库操作=========================================================*/

    /**
     * 查询所有问题
     * @return 返回问题实体类的集合
     */
    @Select("select * from db_question_")
    List<Question_> selectAllQuestion();

    /**
     * 根据Username查询该用户发布的问题
     * @param username
     * @return  Question_实体类
     */
    @Select("select * from db_question_ where username = #{username}")
    Question_ selectQuestionByUsername(@Param("username") String username);

    /**
     * 根据Question_id查询问题
     * @param question_id
     * @return  Question_实体类
     */
    @Select("select * from db_question_ where question_id = #{question_id}")
    Question_ selectQuestionByQuestionId(@Param("question_id") String question_id);

    /**
     * 根据用户id以及问题id查看该问题
     * @param username
     * @param question_id
     * @return Question_实体类
     */
    @Select("select * from db_question_ where username = #{username} and question_id = #{question_id}")
    Question_ selectQuestionByUsernameAndQuestionId(@Param("username") String username, @Param("question_id") String question_id);

    /**
     * 添加新的问题
     * @param question_ 实体类
     * @return 执行的行数
     */
    @Insert("insert into db_question_(username, question_id, question, question_time) " +
            "values (#{question_.username}, #{question_.question_id}, #{question_.question}, #{question_.question_time})")
    int addQuestion(@Param("question_") Question_ question_);

    /**
     * 通过username修改问题的内容
     * @param question_ 实体类
     * @return 执行行数
     */
    @Update("update db_question_ set question = #{question_.question} where username = #{question_.username}")
    int updateQuestionByUsername(@Param("question_") Question_ question_);

    /**
     * 通过question_id删除问题
     * @param question_id
     * @return
     */
    @Delete("delete from db_question_ where question_id = #{question}")
    int deleteQuestionByQuestionId(@Param("question_id") String question_id);



    /*=========================DB_ANSWER_数据库操作=========================================================*/

    /**
     * 查询所有回答
     * @return 返回问题实体类的集合
     */
    @Select("select * from db_answer_")
    List<Answer_> selectAllAnswer();

    /**
     * 根据Username查询该用户发布的问题
     * @param username
     * @return  Question_实体类
     */
    @Select("select * from db_answer_ where username = #{username}")
    Answer_ selectAnswerByUsername(@Param("username") String username);

    /**
     *  根据answer_id查询问题
     * @param answer_id
     * @return Answer_实体类
     */
    @Select("select * from db_answer_ where answer_id = #{answer_id}")
    Answer_ selectAnswerByAnswerId(@Param("answer_id") String answer_id);

    /**
     * 根据username和Answer_id 查询回答
     * @param username
     * @param answer_id
     * @return Answer_实体类
     */
    @Select("select * from db_answer_ where username = #{username} and answer_id = #{answer_id}")
    Answer_ selectAnswerByUsernameAndAnswerId(@Param("username") String username, @Param("answer_id") String answer_id);

    /**
     * 添加新的回答
     * @param answer_ 实体类
     * @return 执行的行数
     */
    @Insert("insert into db_answer_(username, answer_id, answer, answer_time) " +
            "values (#{answer_.username}, #{answer_.answer_id}, #{answer_.answer}, #{answer_.answer_time})")
    int addAnswer(@Param("answer_") Answer_ answer_);

    /**
     * 通过username修改答案的内容
     * @param answer_ 实体类
     * @return 执行行数
     */
    @Update("update db_answer_ set answer = #{answer_.answer} where username = #{answer_.username}")
    int updateAnswerByUsername(@Param("answer") Answer_ answer_);

    /**
     * 通过question_id删除问题
     * @param answer_id
     * @return
     */
    @Delete("delete from db_answer_ where answer_id = #{answer_id}")
    int deleteAnswerByAnswerId(@Param("answer_id") String answer_id);


    /*=========================DB_QUESTION_ANSWER_数据库操作=========================================================*/

    /**
     * 通过问题id查找与该问题相关的答案
     * @param question_id 问题答案
     * @return  返回实体类Question_Answer_的集合
     */
    @Select("select * from db_question_answer_ where question_id = #{question_id}")
    List<Question_Answer_> selectQuestionWithAnswerByQuestionId(@Param("question_id") String question_id);

    /**
     * 插入问题id以及与之相关的回答id
     * @param question_answer_
     * @return 执行的行数
     */
    @Insert("insert into db_question_answer_ value(question_answer_.question_id, question_answer_.answer_id)")
    int insertQuestionWithAnswer(Question_Answer_ question_answer_);

    /**
     * 通过question_id删除相关答案
     * @param qurstion_id
     * @return 执行行数
     */
    @Delete("delete from db_question_answer_ where question_id = #{question_id}")
    int deleteQuestionWithAnswerByQuestionId(@Param("question_id") String qurstion_id);

    /**
     * 通过answer_id删除相关答案
     * @param answer_id
     * @return 执行行数
     */
    @Delete("delete from db_question_answer_ where answer_id = #{answer_id}")
    int deleteQuestionWithAnswerByAnswerId(@Param("answer_id") String answer_id);

}
