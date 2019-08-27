package com.kodilla.spring.good.patterns.challenges;

public class AGDOrderRepository implements OrderRepository {
    @Override
    public void addOrderToRepository (User user, ObjectsToBuy objectsToBuy) {
        System.out.println("Order added to repository");
    }
}
