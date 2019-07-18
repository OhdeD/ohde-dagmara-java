package com.kodilla.stream.wrold;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        Continent africa = new Continent("Africa");
        africa.addCountryToContinentList(new Country("China", new BigDecimal("1000000")));
        africa.addCountryToContinentList(new Country("Egipt", new BigDecimal("1000000")));

        Continent europe = new Continent("Eurpe");
        europe.addCountryToContinentList(new Country("Poland", new BigDecimal("1000000")));

        Continent asia = new Continent("Asia");
        asia.addCountryToContinentList(new Country("China", (new BigDecimal("1000000"))));
        asia.addCountryToContinentList(new Country("India", (new BigDecimal("1000000"))));
        asia.addCountryToContinentList(new Country("Indonesia", (new BigDecimal("1000000"))));
        asia.addCountryToContinentList(new Country("Pakistan", (new BigDecimal("1000000"))));

        Continent americaPD = new Continent("Eurpe");
        americaPD.addCountryToContinentList(new Country("Brazil", (new BigDecimal("1000000"))));
        americaPD.addCountryToContinentList(new Country("Colombia", (new BigDecimal("1000000"))));
        americaPD.addCountryToContinentList(new Country("Argentina", (new BigDecimal("1000000"))));
        americaPD.addCountryToContinentList(new Country("Peru", (new BigDecimal("1000000"))));
        americaPD.addCountryToContinentList(new Country("Venezuela", (new BigDecimal("1000000"))));
        americaPD.addCountryToContinentList(new Country("Chile", (new BigDecimal("1000000"))));
        americaPD.addCountryToContinentList(new Country("Ecuador", (new BigDecimal("1000000"))));

        World world = new World();
        world.addContinent(africa);
        world.addContinent(europe);
        world.addContinent(americaPD);
        world.addContinent(asia);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        assertEquals(new BigDecimal("14000000"), result);
    }

}