package com.kodilla.good.patterns.challenges.purchaseService;

public class PrivateOrderRequestRetriver implements RequestRetriever {

    @Override
    public OrderRequest retreve() {
        User user = new PrivateClient("John Smith", "Lincoln Av.136, 606 Town", "john@gmail.com", "Lincoln Av.136, 606 Town");
        ObjectsToBuy objectsToBuy = new ObjectsToBuy(1, "AGD", 150.50);
        return new OrderRequest(user, objectsToBuy);
       }
}