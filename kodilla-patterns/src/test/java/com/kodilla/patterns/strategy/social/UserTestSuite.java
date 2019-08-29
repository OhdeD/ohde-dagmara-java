package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User fbUser = new Millenials("John Smith");
        User twitterUser = new YGeneration("Kate White");
        User snapUser = new ZGeneration("Rob Green");
        //When
        String fb = fbUser.sharePost();
        String tw = twitterUser.sharePost();
        String sn = snapUser.sharePost();
        System.out.println(fb + " - " + tw + " - " + sn);
        //Then
        Assert.assertEquals("Facebook publisher", fb);
        Assert.assertEquals("Twitter publisher", tw);
        Assert.assertEquals("Snapchat publisher", sn);
    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User fbUser = new Millenials("John Smith");
        User twitterUser = new YGeneration("Kate White");
        User snapUser = new ZGeneration("Rob Green");
        SocialPublisher socialPublisher = new TwitterPublisher();
        //When
        fbUser.setSocialPublisher(new TwitterPublisher());
        String fb = fbUser.sharePost();
        twitterUser.setSocialPublisher(new FacebookPublisher());
        String tw = twitterUser.sharePost();
        System.out.println("Facebook user publish: " + fb);
        System.out.println("Twitter user publish: " + tw);
        //Then
        Assert.assertEquals("Twitter publisher", fb);
        Assert.assertEquals("Facebook publisher", tw);
    }
}
