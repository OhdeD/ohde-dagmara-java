package com.kodilla.spring.good.patterns.FlightsSearch;

public class ConnectionBrowser {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        System.out.println(flightFinder.getFlightsFrom("Kraków"));
    }
}
