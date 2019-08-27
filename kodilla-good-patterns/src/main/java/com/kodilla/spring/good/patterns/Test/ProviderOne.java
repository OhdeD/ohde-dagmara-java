package com.kodilla.spring.good.patterns.Test;

public class ProviderOne implements TestProvider {
    @Override
    public boolean order(String product, int quantity) {
        return false;
    }
}
