package com.kodilla.spring.good.patterns.Food2door;

public interface Contractor {
    public boolean process(RequestMaker requestMaker);
    public RequestMaker getRequestMaker();
    public String getName();
    public String getProduct();
    public String getContact();
    public int getAmount();


}
