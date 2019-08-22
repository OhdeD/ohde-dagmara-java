package com.kodilla.good.patterns.challenges;

public class RentalDto {
    private User user;
    private boolean complete;

    public RentalDto(User user, boolean complete) {
        this.user = user;
        this.complete = complete;
    }
}
