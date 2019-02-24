package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        ForumUser theForum = new ForumUser();
        LocalDate age = LocalDate.of(1989,02,24);

        String theResultStringOfUsers = theForum.getUserList().stream()
                .filter(forum -> forum.getSex() = "M");
                .filter(forum -> forum.getNumberOfPost() > 0);
                .filter(forum -> forum.getBirthDay()is.Before(age))
                .map(ForumUser::toString)


                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfUsers);
    }
}