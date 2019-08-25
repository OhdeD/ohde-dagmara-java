package com.kodilla.good.patterns.Test;

public class TestProviderFactory {
    public static TestProvider getProvider(String provider) {
        switch (provider){
            case "SKLEP1":return new ProviderOne();
            case "SKLEP2":return new ProviderTwo();
            default: return new ProviderThree();
        }
    }
}
