package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.lang.String;

public final class Forum {

        private final List<Forum> theUserList = new ArrayList<>();

        public Forum() {
            theUserList.add(new Forum(1, "Dylan Murphy", "M", 1970.01.01, 38));
            theUserList.add(new Forum(2, "Phoebe Pearson", "W", 1975.01.02, 18));
            theUserList.add(new Forum(3, "Morgan Walsh", "M", 1980.01.20, 240));
            theUserList.add(new Forum(4, "Aimee Murph", "W", 1985.01.15, 240));
            theUserList.add(new Forum(5, "Ryan Talleyh", "M", 1990.01.20, 303));

        }

        public List<Forum> getUserList() {
            return new ArrayList<>(theUserList);
        }
}