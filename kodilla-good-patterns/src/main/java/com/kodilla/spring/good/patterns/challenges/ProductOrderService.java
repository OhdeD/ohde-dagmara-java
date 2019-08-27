package com.kodilla.spring.good.patterns.challenges;

public class ProductOrderService {
    public static void main(String[] args) {
        OrderRequest orderRequest = new OrderRequestRetriver().retreve();
        OrderProcessor orderProcessor = new OrderProcessor( new SMSService(), new AGDOrderService(), new AGDOrderRepository());
        orderProcessor.process(orderRequest);

    }


}
