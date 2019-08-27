package com.kodilla.spring.good.patterns.Food2door;

public class Contractor2 implements Contractor {
    private String name;
    private String product;
    private int amount;
    private String mail;
    private MailRequest mailRequest;

    public Contractor2(String name, String product, int amount, String mail) {
        this.name = name;
        this.product = product;
        this.amount = amount;
        this.mail = mail;
    }

    @Override
    public boolean process(RequestMaker requestMaker) {
        System.out.println("makeing order and paying up-Front");
        return requestMaker.send(mail, product, amount);

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
