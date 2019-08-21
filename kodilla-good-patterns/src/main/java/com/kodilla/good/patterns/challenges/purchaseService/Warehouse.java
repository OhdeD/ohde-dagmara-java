package com.kodilla.good.patterns.challenges.purchaseService;

import java.util.HashMap;

public class Warehouse{
    private static HashMap<String, ObjectsToBuy> warehouse = new HashMap<>();

    public void addToWarehouse(ObjectsToBuy objectsToBuy) {
        String key = objectsToBuy.getObject();
        warehouse.put(key, objectsToBuy);
    }

    public HashMap<String, ObjectsToBuy> getWarehouse() {
        return warehouse;
    }
}

