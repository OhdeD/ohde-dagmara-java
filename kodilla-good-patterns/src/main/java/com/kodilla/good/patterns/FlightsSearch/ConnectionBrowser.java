package com.kodilla.good.patterns.FlightsSearch;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConnectionBrowser {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        System.out.println(flightFinder.getFlightsFrom("Kraków"));
    }
}
