package com.kodilla.good.patterns.challenges.purchaseService;

public class OrderControle {

    public boolean isPurchaseAvailable(String object, int quantity) {
        Warehouse warehouse = new Warehouse();
        if (warehouse.getWarehouse().get(object).getQuantity() >= quantity) {
            System.out.println("This amount of: " + object + " is on storage.");
            return true;
        } else {
            System.out.println("Sorry we're out of " + object + " for now.");
            return false;
        }
    }
}

