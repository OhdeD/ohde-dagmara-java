package com.kodilla.stream.wrold;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private List<Country> countries = new ArrayList<>();
    private String name;


    public void addCountryToContinentList(Country country){
       countries.add(country);
    }

    public Continent(String name) {
        this.name = name;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public String getName() {
        return name;
    }
}
