package com.kodilla.spring.good.patterns.challenges;

public class User {
    private String name;
    private String address;
    private String mail;
    private String shipmentAddress;

    public User(String name, String address, String mail, String shipmentAddress) {
        this.name = name;
        this.address = address;
        this.mail = mail;
        this.shipmentAddress = shipmentAddress;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMail() {
        return mail;
    }

    public String getShipmentAddress() {
        return shipmentAddress;
    }
}
