package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

        private final List<ForumUser> theUserList = new ArrayList<>();

        public Forum() {
            theUserList.add(new ForumUser(1, "Dylan Murphy", 'M', LocalDate.of(1970,1,1), 38));
            theUserList.add(new ForumUser(2, "Phoebe Pearson", 'W', LocalDate.of(1975, 1, 2),18));
            theUserList.add(new ForumUser(3, "Morgan Walsh", 'M', LocalDate.of(1980, 1, 20), 240));
            theUserList.add(new ForumUser(4, "Aimee Murph", 'W', LocalDate.of(1985, 1, 15), 240));
            theUserList.add(new ForumUser(5, "Ryan Talleyh", 'M', LocalDate.of(1990, 1, 20), 303));

        }

        public List<ForumUser> getUserList() {
            return new ArrayList<>(theUserList);
        }
}