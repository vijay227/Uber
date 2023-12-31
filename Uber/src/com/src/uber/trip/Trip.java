package com.src.uber.trip;

import com.src.uber.driver.Driver;
import com.src.uber.driverMatchingStrategy.DriverMatchingStrategy;
import com.src.uber.location.Location;
import com.src.uber.pricingStrategy.PricingStrategy;
import com.src.uber.rider.Rider;
import com.src.uber.util.Util.TRIP_STATUS;

public class Trip {
    private Rider rider;
    private Driver driver;
    private Location srcLoc;
    private Location dstLoc;
    private TRIP_STATUS status;
    private int tripId;
    private double price;
    private PricingStrategy pricingStrategy;
    private DriverMatchingStrategy driverMatchingStrategy;

    private static int nextTripId = 1;

    public Trip(Rider pRider, Driver pDriver, Location pSrcLoc, Location pDstLoc, double pPrice,
                PricingStrategy pPricingStrategy, DriverMatchingStrategy pDriverMatchingStrategy) {
        rider = pRider;	
        driver = pDriver;
        srcLoc = pSrcLoc;
        dstLoc = pDstLoc;
        price = pPrice;
        pricingStrategy = pPricingStrategy;
        driverMatchingStrategy = pDriverMatchingStrategy;
        status = TRIP_STATUS.DRIVER_ON_THE_WAY;

        // This is not thread-safe and is just for demo purposes
        tripId = nextTripId;
        nextTripId++;
    }

    public int getTripId() {
        return tripId;
    }

    public void displayTripDetails() {
        System.out.println();
        System.out.println("Trip id - " + tripId);
        System.out.println("Rider - " + rider.getRiderName());
        System.out.println("Driver - " + driver.getDriverName());
        System.out.println("Price - " + price);
        System.out.println("Locations - " + srcLoc.getLatitude() + "," + srcLoc.getLongitude() +
                " and " + dstLoc.getLatitude() + "," + dstLoc.getLongitude());
    }
}
