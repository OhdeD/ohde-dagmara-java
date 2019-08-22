package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.OrderProcessor;

public class ProductOrderService {
    public static void main(String[] args) {
        OrderRequest orderRequest = new OrderRequestRetriver().retreve();
        OrderProcessor orderProcessor = new OrderProcessor( new SMSService(), new AGDOrderService(), new AGDOrderRepository());
        orderProcessor.process(orderRequest);

    }


}
