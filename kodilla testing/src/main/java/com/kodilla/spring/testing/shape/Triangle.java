package com.kodilla.spring.testing.shape;

public class Triangle implements Shape {
    private String name;
    private double a;
    private double h;

    public Triangle(String name, double a, double h){
        this.name = name;
        this.a = a ;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return this.name;
    }

    @Override
    public double getField() {
        double field = 0.5 * a * h;
        return field;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                ", a=" + a +
                ", h=" + h +
                '}';
    }
}
