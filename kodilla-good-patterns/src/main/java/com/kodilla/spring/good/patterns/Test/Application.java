package com.kodilla.spring.good.patterns.Test;

public class Application {
    public static void main(String[] args) {
        TestOrderProcessor op = new TestOrderProcessor();
        op.order("Żelazko", 1, "SKLEP1");
    }
}
