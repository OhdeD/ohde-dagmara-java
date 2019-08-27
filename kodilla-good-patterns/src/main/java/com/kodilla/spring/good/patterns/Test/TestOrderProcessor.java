package com.kodilla.spring.good.patterns.Test;

public class TestOrderProcessor {
    public boolean order(String product, int quantity, String provider) {
        TestProvider p = TestProviderFactory.getProvider(provider);
        return p.order(product, quantity);
    }
}
