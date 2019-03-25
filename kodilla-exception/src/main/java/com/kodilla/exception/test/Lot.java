package com.kodilla.exception.test;

public class Lot {

    public static void main(String[] args) {
        FlightSearch lot = new FlightSearch();

        try {
            lot.findFilght(new Flight("WII", "WAW"));



        } catch (RouteNotFoundException e) {
            System.out.println("Flight is not possible");
        }



    }
}


//try {
//            messageSender.sendMessageTo(user, "Hello!");
//        } catch (MessageNotSentException e) {
//            System.out.println("Message is not send," +
//                    "but my program still running very well!");
//        }
//
//        System.out.println("Processing other logic!");