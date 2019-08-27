package com.kodilla.spring.exception.test;

import java.util.HashMap;
import java.util.Map;

public class Connections {
    public Map<String, Boolean> getConnections(){
        Map<String, Boolean> connections = new HashMap<>();
        connections.put("KEF", true);
        connections.put("JFK", true);
        connections.put("CPH", false);
        connections.put("LUT", true);
        connections.put("WRC", false);
        connections.put("PRG", false);
        return connections;
    }
}
