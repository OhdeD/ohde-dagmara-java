package com.kodilla.good.patterns.Food2door;

public class Contrator3 implements Contractor{
    private String name;
    private String product;
    private int amount;
    private String mail;
    private MailRequest mailRequest;

    public Contrator3 (String name, String product, int amount, String mail) {
        this.name = name;
        this.product = product;
        this.amount = amount;
        this.mail = mail;
    }

    @Override
    public boolean process(RequestMaker requestMaker) {
        System.out.println("Asking if available ");
        boolean canComplite =requestMaker.send(mail, product, amount);
        System.out.println("Getting confirmation about time of delivery ");
        System.out.println("If delivery is possible on time return true, if not false");
        return canComplite;
    }

    @Override
    public MailRequest getRequestMaker() {
        return mailRequest;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getProduct() {
        return product;
    }

    @Override
    public String getContact() {
        return mail;
    }

    @Override
    public int getAmount() {
        return amount;
    }
}
