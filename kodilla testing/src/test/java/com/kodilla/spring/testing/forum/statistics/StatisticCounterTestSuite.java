package com.kodilla.spring.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticCounterTestSuite {
    private static int counter = 0;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Tests start.");
    }
    @AfterClass
    public static void afterClass (){
        System.out.println("Test finished.");
    }
    @Before
    public void beforeSingleTest (){
        counter++;
        System.out.println("Runing test #" + counter + ".");
    }
    @After
    public void afterSingleTest (){
        System.out.println("Test #" + counter +" done.");
    }

    @Test
    public void testCalculateAdvStatistics100users(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        String a ="a";
        ArrayList<String> usersNames = new ArrayList<String>();
        for(int i=0; i<100; i++) {
            usersNames.add(a);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn ( 137 );
        when(statisticsMock.commentsCount()).thenReturn ( 283);
        StatisticsCounter statistics = new StatisticsCounter(statisticsMock);

        //When
        statistics.calculateAdvStatistics(statisticsMock); statistics.calculateAdvStatistics(statisticsMock);

        //Then
        double numberOfUsers = statistics.getUsersAmount();
        double postsAmount =statistics.getPostsAmount();
        double commentsAmount = statistics.getCommentsAmount();
        double avrgPostsAmountPerUser = statistics.getAvrgPostsAmountPerUser();
        double avrgCommentsAmountPerUser = statistics.getAvrgCommentsAmountPerUser();
        double avrgCommentsAmountPerPost = statistics.getAvrgCommentsAmountPerPost();

        assertEquals(100, numberOfUsers, 0);
        assertEquals(137, postsAmount, 0);
        assertEquals(283, commentsAmount, 0);

        assertEquals(1.37, avrgPostsAmountPerUser, 0.01);
        assertEquals(2.83, avrgCommentsAmountPerUser, 0.01);
        assertEquals(2.07,  avrgCommentsAmountPerPost, 0.01);
    }
    @Test
    public void testCalculateAdvStatistics0users(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        String a ="a";
        ArrayList<String> usersNames = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn ( 137 );
        when(statisticsMock.commentsCount()).thenReturn ( 283);
        StatisticsCounter statistics = new StatisticsCounter(statisticsMock);

        //When
        statistics.calculateAdvStatistics(statisticsMock);

        //Then
        double numberOfUsers = statistics.getUsersAmount();
        double postsAmount =statistics.getPostsAmount();
        double commentsAmount = statistics.getCommentsAmount();
        double avrgPostsAmountPerUser = statistics.getAvrgPostsAmountPerUser();
        double avrgCommentsAmountPerUser = statistics.getAvrgCommentsAmountPerUser();
        double avrgCommentsAmountPerPost = statistics.getAvrgCommentsAmountPerPost();

        assertEquals(0, numberOfUsers, 0);
        assertEquals(137, postsAmount, 0);
        assertEquals(283, commentsAmount, 0);

        assertEquals(0, avrgPostsAmountPerUser, 0.01);
        assertEquals(0, avrgCommentsAmountPerUser, 0.01);
        assertEquals(2.07,  avrgCommentsAmountPerPost, 0.01);
    }
    @Test
    public void testCalculateAdvStatistics0posts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        String a ="a";
        ArrayList<String> usersNames = new ArrayList<String>();
        for(int i=0; i<300; i++) {
            usersNames.add(a);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn ( 0 );
        when(statisticsMock.commentsCount()).thenReturn ( 483);
        StatisticsCounter statistics = new StatisticsCounter(statisticsMock);

        //When
        statistics.calculateAdvStatistics(statisticsMock);

        //Then
        double numberOfUsers = statistics.getUsersAmount();
        double postsAmount =statistics.getPostsAmount();
        double commentsAmount = statistics.getCommentsAmount();
        double avrgPostsAmountPerUser = statistics.getAvrgPostsAmountPerUser();
        double avrgCommentsAmountPerUser = statistics.getAvrgCommentsAmountPerUser();
        double avrgCommentsAmountPerPost = statistics.getAvrgCommentsAmountPerPost();

        assertEquals(300, numberOfUsers, 0);
        assertEquals(0, postsAmount, 0);
        assertEquals(483, commentsAmount, 0);

        assertEquals(0, avrgPostsAmountPerUser, 0.01);
        assertEquals(1.61, avrgCommentsAmountPerUser, 0.01);
        assertEquals(0,  avrgCommentsAmountPerPost, 0.01);
    }
    @Test
    public void testCalculateAdvStatistics1000posts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        String a ="a";
        ArrayList<String> usersNames = new ArrayList<String>();
        for(int i=0; i<300; i++) {
            usersNames.add(a);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn ( 1000 );
        when(statisticsMock.commentsCount()).thenReturn ( 483);
        StatisticsCounter statistics = new StatisticsCounter(statisticsMock);

        //When
        statistics.calculateAdvStatistics(statisticsMock);

        //Then
        double numberOfUsers = statistics.getUsersAmount();
        double postsAmount =statistics.getPostsAmount();
        double commentsAmount = statistics.getCommentsAmount();
        double avrgPostsAmountPerUser = statistics.getAvrgPostsAmountPerUser();
        double avrgCommentsAmountPerUser = statistics.getAvrgCommentsAmountPerUser();
        double avrgCommentsAmountPerPost = statistics.getAvrgCommentsAmountPerPost();

        assertEquals(300, numberOfUsers, 0);
        assertEquals(1000, postsAmount, 0);
        assertEquals(483, commentsAmount, 0);

        assertEquals(3.33, avrgPostsAmountPerUser, 0.01);
        assertEquals(1.61, avrgCommentsAmountPerUser, 0.01);
        assertEquals(0.48,  avrgCommentsAmountPerPost, 0.01);
    }
    @Test
    public void testCalculateAdvStatistics0comments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        String a ="a";
        ArrayList<String> usersNames = new ArrayList<String>();
        for(int i=0; i<300; i++) {
            usersNames.add(a);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn ( 150 );
        when(statisticsMock.commentsCount()).thenReturn ( 0);
        StatisticsCounter statistics = new StatisticsCounter(statisticsMock);

        //When
        statistics.calculateAdvStatistics(statisticsMock);

        //Then
        double numberOfUsers = statistics.getUsersAmount();
        double postsAmount =statistics.getPostsAmount();
        double commentsAmount = statistics.getCommentsAmount();
        double avrgPostsAmountPerUser = statistics.getAvrgPostsAmountPerUser();
        double avrgCommentsAmountPerUser = statistics.getAvrgCommentsAmountPerUser();
        double avrgCommentsAmountPerPost = statistics.getAvrgCommentsAmountPerPost();

        assertEquals(300, numberOfUsers, 0);
        assertEquals(150, postsAmount, 0);
        assertEquals(0, commentsAmount, 0);

        assertEquals(0.5, avrgPostsAmountPerUser, 0.01);
        assertEquals(0, avrgCommentsAmountPerUser, 0.01);
        assertEquals(0,  avrgCommentsAmountPerPost, 0.01);
    }
    @Test
    public void testCalculateAdvStatisticsMorePostsThanComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        String a ="a";
        ArrayList<String> usersNames = new ArrayList<String>();
        for(int i=0; i<300; i++) {
            usersNames.add(a);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn ( 150 );
        when(statisticsMock.commentsCount()).thenReturn ( 50);
        StatisticsCounter statistics = new StatisticsCounter(statisticsMock);

        //When
        statistics.calculateAdvStatistics(statisticsMock);

        //Then
        double numberOfUsers = statistics.getUsersAmount();
        double postsAmount =statistics.getPostsAmount();
        double commentsAmount = statistics.getCommentsAmount();
        double avrgPostsAmountPerUser = statistics.getAvrgPostsAmountPerUser();
        double avrgCommentsAmountPerUser = statistics.getAvrgCommentsAmountPerUser();
        double avrgCommentsAmountPerPost = statistics.getAvrgCommentsAmountPerPost();

        assertEquals(300, numberOfUsers, 0);
        assertEquals(150, postsAmount, 0);
        assertEquals(50, commentsAmount, 0);

        assertEquals(0.5, avrgPostsAmountPerUser, 0.01);
        assertEquals(0.16, avrgCommentsAmountPerUser, 0.01);
        assertEquals(0.33,  avrgCommentsAmountPerPost, 0.01);
    }
    @Test
    public void testCalculateAdvStatisticsMoreCommentsThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        String a ="a";
        ArrayList<String> usersNames = new ArrayList<String>();
        for(int i=0; i<300; i++) {
            usersNames.add(a);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn ( 150 );
        when(statisticsMock.commentsCount()).thenReturn ( 500);
        StatisticsCounter statistics = new StatisticsCounter(statisticsMock);

        //When
        statistics.calculateAdvStatistics(statisticsMock);

        //Then
        double numberOfUsers = statistics.getUsersAmount();
        double postsAmount =statistics.getPostsAmount();
        double commentsAmount = statistics.getCommentsAmount();
        double avrgPostsAmountPerUser = statistics.getAvrgPostsAmountPerUser();
        double avrgCommentsAmountPerUser = statistics.getAvrgCommentsAmountPerUser();
        double avrgCommentsAmountPerPost = statistics.getAvrgCommentsAmountPerPost();

        assertEquals(300, numberOfUsers, 0);
        assertEquals(150, postsAmount, 0);
        assertEquals(500, commentsAmount, 0);
        assertEquals(0.5, avrgPostsAmountPerUser, 0.01);
        assertEquals(1.66, avrgCommentsAmountPerUser, 0.01);
        assertEquals(3.33,  avrgCommentsAmountPerPost, 0.01);
    }


}
