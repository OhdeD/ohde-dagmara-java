package com.kodilla.kodillapatterns2.dekorator.pizza;

public class HamDecorator extends AbstractPizzaDecorator {
    public HamDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getTopping() {
        return super.getTopping() + " + ham";
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 1.50;
    }
}
