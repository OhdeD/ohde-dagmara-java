package com.kodilla.good.patterns.Food2door;

public class OrderProcessor {

    public void orderProcess(Contractor contractor, RequestMaker requestMaker) {
        boolean iscomplited = contractor.process(requestMaker);
        if (iscomplited) {
            System.out.println("Order complite");
        } else {
            System.out.println("Order cancelled");
        }
    }
}
