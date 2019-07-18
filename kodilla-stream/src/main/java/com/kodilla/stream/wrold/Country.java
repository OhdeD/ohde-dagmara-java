package com.kodilla.stream.wrold;

import java.math.BigDecimal;

public final class Country {
    private final String name;
    private final BigDecimal population;

    public Country(final String name, final BigDecimal population) {
        this.name = name;
        this.population = population;
    }

    public final BigDecimal getPeopleQuantity(){
        return population;
    }

    public String getName() {
        return name;
    }
}
