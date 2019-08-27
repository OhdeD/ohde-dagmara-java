package com.kodilla.spring.good.patterns.Food2door;

public class OrderService {
    public static void main(String[] args) {
        Contractor contractor = new ContractorRetriver().getContractor();
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.orderProcess(contractor, contractor.getRequestMaker());
    }
}
