package com.kodilla.spring.good.patterns.Food2door;

public interface RequestMaker {
    public boolean send( String mailOrPhoneEtc, String product, int amount);
}
