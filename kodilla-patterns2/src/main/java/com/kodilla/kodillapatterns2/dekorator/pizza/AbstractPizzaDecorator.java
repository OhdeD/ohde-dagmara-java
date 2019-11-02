package com.kodilla.kodillapatterns2.dekorator.pizza;

public abstract class AbstractPizzaDecorator implements Pizza{
    private final Pizza pizza;

    public AbstractPizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getBase() {
        return pizza.getBase();
    }

    @Override
    public String getSauce() {
        return pizza.getSauce();
    }

    @Override
    public String getTopping() {
        return pizza.getTopping();
    }

    @Override
    public Double getPrice() {
        return pizza.getPrice();
    }
}
