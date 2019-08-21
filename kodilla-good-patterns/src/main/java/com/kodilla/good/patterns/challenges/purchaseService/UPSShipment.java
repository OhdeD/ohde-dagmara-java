package com.kodilla.good.patterns.challenges.purchaseService;

public class UPSShipment implements ShipmentExecutor {
    private OrderRequest orderRequest;

    public UPSShipment(OrderRequest orderRequest) {
        this.orderRequest = orderRequest;
    }

    @Override
    public String send() {
       return orderRequest.getUser().getName() + " " + orderRequest.getUser().getShipmentAddress() + " to pay: " + orderRequest.getObjectsToBuy().getPrice() + ".";
    }
}
