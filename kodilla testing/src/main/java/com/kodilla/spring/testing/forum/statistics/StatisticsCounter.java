package com.kodilla.spring.testing.forum.statistics;

public class StatisticsCounter {
    Statistics statistics;
    double usersAmount ;
    double postsAmount;
    double commentsAmount;
    double avrgPostsAmountPerUser;
    double avrgCommentsAmountPerUser;
    double avrgCommentsAmountPerPost;

    public StatisticsCounter(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.usersAmount = statistics.usersNames().size();
        this.postsAmount = statistics.postsCount();
        this.commentsAmount = statistics.commentsCount();

        if(usersAmount == 0) {
            this.avrgCommentsAmountPerUser = 0 ;
            this.avrgPostsAmountPerUser =0;
        }else {
            this.avrgCommentsAmountPerUser=commentsAmount / usersAmount;
            this.avrgPostsAmountPerUser = postsAmount / usersAmount;
        }
        if(postsAmount == 0) {
            this.avrgCommentsAmountPerPost =0;
        }else{
            this.avrgCommentsAmountPerPost = commentsAmount / postsAmount;
        }
    }

    public void showStatistics() {
        System.out.println("Current users amount: " + usersAmount + ". /n" + "Current posts amount: "
                + postsAmount + "./n" + "Current comments amount: " + commentsAmount + "./n"
                + "Average posts per user amount: " + avrgPostsAmountPerUser + "./n"
                + "Average comment per user amount: " + avrgCommentsAmountPerUser + "./n"
                + "Averagre comments per post amounts: " + avrgCommentsAmountPerPost + ".");
    }

    public double getUsersAmount() {
        return this.usersAmount;
    }

    public double getPostsAmount() {
        return this.postsAmount;
    }

    public double getCommentsAmount() {
        return this.commentsAmount;
    }

    public double getAvrgPostsAmountPerUser() {
        return this.avrgPostsAmountPerUser;
    }

    public double getAvrgCommentsAmountPerUser() {
        return this.avrgCommentsAmountPerUser;
    }

    public double getAvrgCommentsAmountPerPost() {
        return this.avrgCommentsAmountPerPost;
    }
}

