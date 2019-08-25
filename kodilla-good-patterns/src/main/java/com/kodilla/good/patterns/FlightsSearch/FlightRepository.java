package com.kodilla.good.patterns.FlightsSearch;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlights(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warszawa", "Kraków"));
        flights.add(new Flight("Warszawa", "Gdańsk"));
        flights.add(new Flight("Wrocław", "Gdańsk"));
        flights.add(new Flight("Kraków", "Wrocław"));
        flights.add(new Flight("Kraków", "Poznań"));
        return flights;
    }
}
