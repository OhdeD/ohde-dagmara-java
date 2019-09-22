package com.kodilla.spring.stream;

import com.kodilla.spring.stream.beautifier.PoemBeautifier;
import com.kodilla.spring.stream.forumUser.Forum;
import com.kodilla.spring.stream.forumUser.ForumUser;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

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


        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("dagmara", (a)->a.toUpperCase());
        poemBeautifier.beautify("dagmara", (a)->"..." + a.toUpperCase() + "...");

    }
}