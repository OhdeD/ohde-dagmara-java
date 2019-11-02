package com.kodilla.kodillapatterns2.dekorator.pizza;

public class BasicPizza implements Pizza{
    @Override
    public String getBase() {
        return "Base";
    }

    @Override
    public String getSauce() {
        return "Tomato sauce";
    }

    @Override
    public String getTopping() {
        return "Cheese";
    }

    @Override
    public Double getPrice() {
        return 15.00;
    }
}
