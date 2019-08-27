package com.kodilla.spring.good.patterns.challenges;

public class OrderRequestRetriver  {

    public OrderRequest retreve() {
        User user = new User("John Smith", "Lincoln Av.136, 606 Town", "john@gmail.com", "Lincoln Av.136, 606 Town");
        ObjectsToBuy objectsToBuy = new ObjectsToBuy(1, "AGD", 150.50);
        return new OrderRequest(user, objectsToBuy);
       }
}