package com.kodilla.good.patterns.Food2door;

import com.sun.org.apache.xpath.internal.operations.Or;

public class OrderService {
    public static void main(String[] args) {
        Contractor contractor = new ContractorRetriver().getContractor();
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.orderProcess(contractor, contractor.getRequestMaker());
    }
}
