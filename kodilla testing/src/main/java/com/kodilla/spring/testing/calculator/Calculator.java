package com.kodilla.spring.testing.calculator;

public class Calculator {
    private double a;
    private double b;

    public Calculator (double a, double b){
        this.a=a;
        this.b=b;
    }

    public double addAtoB(){
        return a+b;
    }

    public double subtractAfromB(){
        return b - a ;
    }
}
