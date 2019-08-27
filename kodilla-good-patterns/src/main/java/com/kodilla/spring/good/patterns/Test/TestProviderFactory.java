package com.kodilla.spring.good.patterns.Test;

public class TestProviderFactory {
    public static TestProvider getProvider(String provider) {
        switch (provider){
            case "SKLEP1":return new ProviderOne();
            default: return null;
        }
    }
}
