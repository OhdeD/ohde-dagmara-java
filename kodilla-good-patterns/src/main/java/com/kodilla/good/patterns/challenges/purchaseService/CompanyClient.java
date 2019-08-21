package com.kodilla.good.patterns.challenges.purchaseService;

public class CompanyClient implements User {
    private String object;
    private String address;
    private String mail;
    private String shipmentAddress;
    private String NIP;

    public CompanyClient(String name, String address, String mail, String shipmentAddress, String NIP) {
        this.object = name;
        this.address = address;
        this.mail = mail;
        this.shipmentAddress = shipmentAddress;
        this.NIP = NIP;
    }

    @Override
    public String getName() {
        return object;
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

    public String getNIP() {
        return NIP;
    }
}
