package com.kodilla.good.patterns.challenges.purchaseService;

public class PrivateClient implements User {
    private String name;
    private String address;
    private String mail;
    private String shipmentAddress;

    public PrivateClient(String name, String address, String mail, String shipmentAddress) {
        this.name = name;
        this.address = address;
        this.mail = mail;
        this.shipmentAddress = shipmentAddress;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getMail() {
        return mail;
    }

    @Override
    public String getShipmentAddress() {
        return shipmentAddress;
    }
}
