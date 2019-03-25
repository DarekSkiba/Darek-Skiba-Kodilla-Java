package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightSearch {


    HashMap<String, Boolean> airport = new HashMap<> ();
    {
        airport.put("WAW", true);
        airport.put("MUC", true);
        airport.put("WMI", false);
        airport.put("LTH", true);
        airport.put("KVB", true);

    }



    public void findFilght(Flight flight) throws RouteNotFoundException {

        if(airport.get(flight.getDepartureAirport()) != null && airport.get(flight.getDepartureAirport())) {
            System.out.println("Flight from: " + flight.getDepartureAirport() + " to: " + flight.getArrivalAirport());

        } else {

            throw new RouteNotFoundException("Flight is not possible");
        }
    }
}