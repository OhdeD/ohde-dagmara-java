package com.kodilla.spring.good.patterns.challenges;

public class OrderRequest   {
    private User user;
    private ObjectsToBuy objectsToBuy;

    public OrderRequest (User user, ObjectsToBuy objectsToBuy) {
        this.user = user;
        this.objectsToBuy = objectsToBuy;
    }

    public User getUser() {
        return user;
    }

    public ObjectsToBuy getObjectsToBuy() {
        return objectsToBuy;
    }

}
