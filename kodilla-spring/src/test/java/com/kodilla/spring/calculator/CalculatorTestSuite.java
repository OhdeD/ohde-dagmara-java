package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double a = calculator.add(120.00, 6.00);
        double b = calculator.sub(120.00, 6.00);
        double c = calculator.mul(12.00, 6.00);
        double d = calculator.div(120.00, 6.00);
        //Then
        Assert.assertEquals(126.00, a, 0.1);
        Assert.assertEquals(114.00, b, 0.1);
        Assert.assertEquals(72.00, c, 0.1);
        Assert.assertEquals(20.00, d, 0.1);
    }
}
