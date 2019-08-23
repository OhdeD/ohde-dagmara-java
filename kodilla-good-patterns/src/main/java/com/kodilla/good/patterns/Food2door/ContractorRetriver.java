package com.kodilla.good.patterns.Food2door;

public class ContractorRetriver {
    public Contractor getContractor() {
        Contractor contractor = new Contractor1("Contractor1", "BLT Sandwiches", 200, "goodfood@goodfood.pl");
        return contractor;
    }
}
