package com.CabInvoiceGenerator.BridgeLabz;

public class CabInvoiceGenerator {   /*
 * UC 2 -
 */
    private static final int MIN_COST_PER_KM = 10;
    private static final int COST_PER_TIME = 1;
    private static final int MIN_FARE = 5;

    public double Fare(double distance, int time) {
        double totalFare = distance * MIN_COST_PER_KM + time * COST_PER_TIME;
        if (totalFare < MIN_FARE) {
            return MIN_FARE;
        }
        return totalFare;
    }

    public double multipleRide(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += Fare(ride.distance, ride.time);
        }
        return totalFare;
    }
    
}
