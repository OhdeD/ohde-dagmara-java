package com.kodilla.kodillapatterns2.dekorator.pizza;

public class GarlicSauceDecorator extends AbstractPizzaDecorator {
    public GarlicSauceDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getSauce() {
        return super.getSauce() + " + garlic sauce";
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 0.50;
    }
}
