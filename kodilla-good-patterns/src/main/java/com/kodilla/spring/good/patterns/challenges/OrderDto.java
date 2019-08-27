package com.kodilla.spring.good.patterns.challenges;

public class OrderDto {
    private User user;
    private boolean complete;

    public OrderDto(User user, boolean complete) {
        this.user = user;
        this.complete = complete;
    }
}
