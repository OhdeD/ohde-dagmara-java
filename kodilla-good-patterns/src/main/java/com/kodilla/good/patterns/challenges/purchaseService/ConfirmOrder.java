package com.kodilla.good.patterns.challenges.purchaseService;

import java.awt.*;

public class ConfirmOrder{
    private OrderRequest orderRequest;

    public ConfirmOrder(OrderRequest orderRequest) {
        this.orderRequest = orderRequest;
    }

    public String message() {
      return "Your order is accepted. We'll send it on: " + orderRequest.getUser().getName() + ", " + orderRequest.getUser().getShipmentAddress() + ". Thanks.";
    }


}
