package com.kodilla.kodillapatterns2.observer.forum;

public class ForumUser implements Observer {
    private final String userName;
    private int updateCount;

    public ForumUser(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(ForumTopic forumTopic) {
        System.out.println(userName + ": New messages in topic " + forumTopic.getName() + "\n (total: " + forumTopic.getMessages().size() + " messages)");
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
