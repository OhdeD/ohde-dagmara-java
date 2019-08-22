package com.kodilla.good.patterns.challenges;

public class SMSService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Sending SMS on client's number");
    }
}
