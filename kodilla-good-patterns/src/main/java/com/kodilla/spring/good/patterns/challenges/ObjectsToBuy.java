package com.kodilla.spring.good.patterns.challenges;

public class ObjectsToBuy {
    private int quantity;
    private String object;
    private double price;

    public ObjectsToBuy(int quantity, String object, double price) {
        this.quantity = quantity;
        this.object = object;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getObject() {
        return object;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Clothes " +
                "avaliable now: " + quantity +
                ", each costs: " + price +
                "PLN. ";
    }
}