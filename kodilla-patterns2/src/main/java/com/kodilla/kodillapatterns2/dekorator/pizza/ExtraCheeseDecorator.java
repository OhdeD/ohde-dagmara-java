package com.kodilla.kodillapatterns2.dekorator.pizza;

public class ExtraCheeseDecorator extends AbstractPizzaDecorator {
    public ExtraCheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getTopping() {
        return super.getTopping() + " + extra cheese";
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 2.00;
    }
}
