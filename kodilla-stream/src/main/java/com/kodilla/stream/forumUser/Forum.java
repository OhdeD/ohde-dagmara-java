package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


public final class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(123, "user1", 'm', LocalDate.of(1975, Month.MAY, 10), 10));
        usersList.add(new ForumUser(1233, "user142", 'm', LocalDate.of(2005, Month.MARCH, 30), 130));
        usersList.add(new ForumUser(1253, "user122", 'k', LocalDate.of(1999, Month.MAY, 3), 13));
        usersList.add(new ForumUser(12353, "user132", 'k', LocalDate.of(1937, Month.APRIL, 11), 183));
        usersList.add(new ForumUser(123663, "user129", 'm', LocalDate.of(1739, Month.MAY, 23), 293));
        usersList.add(new ForumUser(124333, "user127", 'm', LocalDate.of(1985, Month.JANUARY, 22), 223));
        usersList.add(new ForumUser(123233, "user1452", 'm', LocalDate.of(2001, Month.DECEMBER, 14), 0));
        usersList.add(new ForumUser(129733, "user152", 'm', LocalDate.of(1987, Month.MAY, 18), 63));
    }

    public List<ForumUser> getUsersList() {
        return (usersList);
    }


}
