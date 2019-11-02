package com.kodilla.kodillapatterns2.decorator.pizza;

import com.kodilla.kodillapatterns2.dekorator.pizza.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PizzaTestSuite {
    @Test
    public void testExtraCheeseDecorator(){
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new ExtraCheeseDecorator(thePizza);
        //When
        String toppings = thePizza.getTopping();
        double price = thePizza.getPrice();
        //Then
        assertEquals("Cheese + extra cheese", toppings);
        assertEquals(17.00, price, 0.01);
    }

    @Test
    public void testHamAndExtraCheeseDecorator(){
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new ExtraCheeseDecorator(thePizza);
        thePizza = new HamDecorator(thePizza);
        //When
        String toppings = thePizza.getTopping();
        double price = thePizza.getPrice();
        //Then
        assertEquals("Cheese + extra cheese + ham", toppings);
        assertEquals(18.50, price, 0.01);
    }
    @Test
    public void testExtraCheeseHamBaconGarlicSauceDecorator(){
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new ExtraCheeseDecorator(thePizza);
        thePizza = new HamDecorator(thePizza);
        thePizza = new BaconDecorator(thePizza);
        thePizza = new GarlicSauceDecorator(thePizza);
        //When
        String sauce = thePizza.getSauce();
        String toppings = thePizza.getTopping();
        double price = thePizza.getPrice();
        //Then
        assertEquals("Tomato sauce + garlic sauce", sauce);
        assertEquals("Cheese + extra cheese + ham + bacon", toppings);
        assertEquals(21.50, price, 0.01);

    }

}
