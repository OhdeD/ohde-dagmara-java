package com.kodilla.spring.good.patterns.Food2door;

public class Contractor1 implements Contractor {
    private String name;
    private String product;
    private int amount;
    private String mail;
    private MailRequest mailRequest;

    public Contractor1(String name, String product, int amount, String mail) {
        this.name = name;
        this.product = product;
        this.amount = amount;
        this.mail = mail;
    }

    @Override
    public boolean process(RequestMaker requestMaker) {
        boolean canComplite = requestMaker.send(mail, product, amount);
        if (canComplite) {
            System.out.println("makeing order and paying");
            return true;
        } else {
            System.out.println("can't make this order. contact with " + name);
            return false;
        }
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
