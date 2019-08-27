package com.kodilla.spring.stream.forumUser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String nick;
    private final char sex;
    private final LocalDate birth;
    private final int posts;

    public ForumUser( final int userID, final String nick, final char sex, final LocalDate birth, final int posts) {
        this.userID = userID;
        this.nick = nick;
        this.sex = sex;
        this.birth = birth;
        this.posts = posts;
    }

    public int getUserID() {
        return userID;
    }

    public String getNick() {
        return nick;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", nick='" + nick + '\'' +
                ", sex=" + sex +
                ", birth=" + birth +
                ", posts=" + posts +
                '}';
    }
}
