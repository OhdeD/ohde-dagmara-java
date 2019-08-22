package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.ObjectsToBuy;
import com.kodilla.good.patterns.challenges.OrderRepository;
import com.kodilla.good.patterns.challenges.User;

public class AGDOrderRepository implements OrderRepository {
    @Override
    public void addOrderToRepository (User user, ObjectsToBuy objectsToBuy) {
        System.out.println("Order added to repository");
    }
}
