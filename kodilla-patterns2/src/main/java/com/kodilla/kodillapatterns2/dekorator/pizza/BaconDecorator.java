package com.kodilla.kodillapatterns2.dekorator.pizza;

public class BaconDecorator extends AbstractPizzaDecorator {
    public BaconDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getTopping() {
        return super.getTopping() + " + bacon";
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 2.50;
    }
}
