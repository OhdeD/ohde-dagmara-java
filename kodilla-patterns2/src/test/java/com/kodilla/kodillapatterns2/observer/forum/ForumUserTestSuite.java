package com.kodilla.kodillapatterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.*;

public class ForumUserTestSuite {

    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();

        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");

        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);
        //When
        javaHelpForum.addPost("Hi, could You help me?");
        javaHelpForum.addPost("Hi, no!");
        javaToolsForum.addPost("Help me pls, nothing work");
        javaHelpForum.addPost("Why? PLS.");
        javaToolsForum.addPost("there is bad credentials");
        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());


    }
}