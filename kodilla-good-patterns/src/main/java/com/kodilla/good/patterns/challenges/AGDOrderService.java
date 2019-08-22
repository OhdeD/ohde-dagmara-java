package com.kodilla.good.patterns.challenges;

public class AGDOrderService implements OrderService {
    @Override
    public boolean orderProcessing (OrderRequest orderRequest){
        System.out.println("Ordered: " + orderRequest.getObjectsToBuy().getQuantity() + " pieces of: " + orderRequest.getObjectsToBuy().getObject() + "." );
        return true;
    }

}
