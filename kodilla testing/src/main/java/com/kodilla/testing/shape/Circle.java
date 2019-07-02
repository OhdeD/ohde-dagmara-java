package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String name;
    private double r;

    public Circle(String name, double r){
        this.name = name;
        this.r= r;
    }

    @Override
    public String getShapeName() {
        return this.name;
    }

    @Override
    public double getField() {
        double field = Math.PI * Math.pow(r,2);
        return field;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", r=" + r +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.r, r) != 0) return false;
        return name != null ? name.equals(circle.name) : circle.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(r);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
