package com.kodilla.spring.stream.wrold;

        import java.math.BigDecimal;
        import java.util.ArrayList;
        import java.util.List;

public final class World {
    private final List<Continent> continents = new ArrayList<>();

    public void addContinent(Continent continent){
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        return continents.stream()
                .flatMap(c->c.getCountries().stream())
                .map(a->a.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, delta)-> sum = sum.add(delta));
    }

}
