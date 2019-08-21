package com.kodilla.good.patterns.challenges.purchaseService;


public class DeclineOrder{
    private OrderRequest orderRequest;

    public DeclineOrder(OrderRequest orderRequest) {
        this.orderRequest = orderRequest;
    }

    public String message() {
        return "Your order was canceled. We don't have " + orderRequest.getObjectsToBuy().getQuantity() + " pieces of " + orderRequest.getObjectsToBuy().getObject() + ". Sorry for inconvience.";
    }
}