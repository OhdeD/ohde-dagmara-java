package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;

import java.time.LocalDate;
import java.time.Month;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<String,ForumUser> filtredUsers= forum.getUsersList().stream()
                .filter(user -> user.getSex() == 'm')
                .filter(age -> age.getBirth().getYear() > LocalDate.now().minusYears(21).getYear())
                .filter(post -> post.getPosts() != 0 )
                .collect(Collectors.toMap(ForumUser::getNick, c ->c ));

        System.out.println("number of filtred users: #" + filtredUsers.size() );

        filtredUsers.entrySet().stream()
                .map(entry -> entry.getKey() + "~~" + entry.getValue())
                .forEach(System.out::println);
    }
}