package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate birthDay;
    private final int numberOfPost;

    public ForumUser(int userID, String userName, char sex, LocalDate birthDay, int numberOfPost) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.birthDay = birthDay;
        this.numberOfPost = numberOfPost;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDay=" + birthDay +
                ", numberOfPost=" + numberOfPost +
                '}';
    }

}
