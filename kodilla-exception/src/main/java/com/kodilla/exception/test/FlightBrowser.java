package com.kodilla.exception.test;

import jdk.nashorn.internal.ir.IfNode;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightBrowser {

    public String findFlight(Flight flight) throws RouteNotFoundException {
        Connections connections = new Connections();

        if (connections.getConnections().get(flight.getArrivalAirport()) != null){
            boolean connectionPossibility = connections.getConnections().get(flight.getArrivalAirport());

            if (connectionPossibility) {
                return "You can pick this connection.";
            } else {
                return "You can't pick this destination.";
            }
        } else {
            throw new RouteNotFoundException();
        }
    }

    public static void main(String[] args) {
        FlightBrowser flightBrowser = new FlightBrowser();

        try{
            System.out.println(flightBrowser.findFlight(new Flight("KEF", "CPH")));
        }catch (RouteNotFoundException r){
            System.out.println("There is no such destination in our DataBase. Try tipe it with capital letters.");
        }
    }
}
