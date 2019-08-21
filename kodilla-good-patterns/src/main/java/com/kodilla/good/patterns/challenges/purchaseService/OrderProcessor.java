package com.kodilla.good.patterns.challenges.purchaseService;

public class OrderProcessor {

    public void OrderProcessor() {
        OrderRequest orderRequest = new PrivateOrderRequestRetriver().retreve();
        boolean ifIsToSend = new InformationProcessor().processor(orderRequest);
       if (ifIsToSend) {
           System.out.println(new UPSShipment(orderRequest).send());
       }
    }
}
