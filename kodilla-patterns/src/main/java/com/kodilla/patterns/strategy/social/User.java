package com.kodilla.patterns.strategy.social;

public class User {
    private final String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public SocialPublisher setSocialPublisher(SocialPublisher socialPublisher){
        this.socialPublisher = socialPublisher;
        return socialPublisher;
    }

    public String sharePost(){
        return socialPublisher.share();
    }
}
