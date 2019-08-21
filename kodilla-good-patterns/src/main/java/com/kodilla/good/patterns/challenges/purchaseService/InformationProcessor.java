package com.kodilla.good.patterns.challenges.purchaseService;

public class InformationProcessor {

    public boolean processor(OrderRequest orderRequest) {
        boolean isAvailable = new OrderControle().isPurchaseAvailable(orderRequest.getObjectsToBuy().getObject(), orderRequest.getObjectsToBuy().getQuantity());
        if (isAvailable) {
            new ConfirmOrder(orderRequest).message();
            return true;
        } else {
            new DeclineOrder(orderRequest).message();
            return false;
        }
    }


}
