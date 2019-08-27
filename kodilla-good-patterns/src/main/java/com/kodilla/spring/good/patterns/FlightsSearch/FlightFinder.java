package com.kodilla.spring.good.patterns.FlightsSearch;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class FlightFinder {
    public List<Flight> getFlightsFrom(String airport) {
        return FlightRepository.getFlights()
                .stream()
                .filter(f -> f.getDeparture().equals(airport))
                .collect(toList());
    }

    public List<Flight> getFlightsTo(String airport) {
        return FlightRepository.getFlights()
                .stream()
                .filter(f -> f.getArrival().equals(airport))
                .collect(toList());
    }

    public List<Flight> getFlightsVia(String from, String via, String to) {

        List<Flight> flights = FlightRepository.getFlights()
                .stream()
                .filter(f -> f.getDeparture().equals(from))
                .filter(f -> f.getArrival().equals(via))
                .collect(toList());
        flights.addAll(FlightRepository.getFlights()
                .stream()
                .filter(f -> f.getDeparture().equals(via))
                .filter(f -> f.getArrival().equals(to))
                .collect(toList()));
        return flights;
    }
}
