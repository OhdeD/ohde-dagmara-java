package com.kodilla.good.patterns.Food2door;

public class MailRequest implements RequestMaker {
    private Contractor contractor;

    public MailRequest(Contractor contractor) {
        this.contractor = contractor;
    }

    @Override
    public boolean send(String mail, String product, int amount){
        System.out.println("sending request about: " + product + " in amount " + amount + " on: " + mail);
        boolean serverAnswer = true;
        if (serverAnswer) {
            return true;
        }else {
            return false;
        }
    }
}
