package com.kodilla.spring.testing.shape;

public class Square implements Shape {
    private String name;
    private double a;

    public Square(String name, double a){
        this.name = name;
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return this.name;
    }

    @Override
    public double getField() {
        double field = Math.pow(a,2);
        return field;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", a=" + a +
                '}';
    }
}
