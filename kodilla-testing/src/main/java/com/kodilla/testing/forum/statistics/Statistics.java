package com.kodilla.testing.forum.statistics;

import java.util.HashMap;
import java.util.List;

public interface Statistics {
    List<String> usersNames(); // list of users names

    int postsCount();          // total quantity of forum posts
    int commentsCount();       // total quantity of forum comments
}


public class StatisticsCalculator {
    private int userCount; //liczbę użytkowników,
    private int postCount; //liczbę postów,
    private int commentCount; //liczbę komentarzy,
    private double avgPostCountPerUser; //średnią liczbę postów na użytkownika,
    private double avgCommentCountPerUser; //średnią liczbę komentarzy na użytkownika,
    private double avgCommentCountPerPost; //średnią liczbę komentarzy na post.


    public void calculateAdvStatistics(Statistics statistics) {
        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();
        avgPostCountPerUser = postCount / userCount;
        avgCommentCountPerUser = commentCount / userCount;
        avgCommentCountPerPost = commentCount / postCount;
    }

    public void showStatistics() {
        System.out.println("Statistics:\n"
                + "User count = " + userCount + "\n"
                + "Post count = " + postCount + "\n"
                + "Comment count = " + commentCount + "\n"
                + "Average post count per user = " + avgPostCountPerUser + "\n"
                + "Average comment count per user = " + avgCommentCountPerUser + "\n"
                + "Average comment count per post = " + avgCommentCountPerPost);
    }

    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getAvgPostCountPerUser() {
        return avgPostCountPerUser;
    }

    public double getAvgCommentCountPerUser() {
        return avgCommentCountPerUser;
    }

    public double getAvgCommentCountPerPost() {
        return avgCommentCountPerPost;
    }
}