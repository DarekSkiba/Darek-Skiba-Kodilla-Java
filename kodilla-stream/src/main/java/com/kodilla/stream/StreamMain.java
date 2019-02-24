package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum theForum = new Forum();
        LocalDate age = LocalDate.now().minusYears(20);

        String theResultStringOfUsers = theForum.getUserList().stream()
                .filter(forum -> forum.getSex() == 'M')
                .filter(forum -> forum.getNumberOfPost() > 0)
                .filter(forum -> forum.getBirthDay().isBefore(age))
                .map(ForumUser::toString)


                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfUsers);
    }
}