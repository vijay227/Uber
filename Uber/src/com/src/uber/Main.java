package com.src.uber;

import java.util.Map;

import com.src.uber.driver.Driver;
import com.src.uber.driver.DriverMgr;
import com.src.uber.location.Location;
import com.src.uber.rider.Rider;
import com.src.uber.rider.RiderMgr;
import com.src.uber.trip.Trip;
import com.src.uber.trip.TripMgr;
import com.src.uber.util.Util;

public class Main {
    public static void main(String[] args) {
        // Creating Riders and Drivers
        Rider vijayRider = new Rider("Vijay", Util.RATING.FIVE_STARS);
        Rider galandeRider = new Rider("Galande", Util.RATING.FIVE_STARS);
        RiderMgr riderMgr = RiderMgr.getRiderMgr();
        riderMgr.addRider("Vijay", vijayRider);
        riderMgr.addRider("Galande", galandeRider);

        Driver yogitaDriver = new Driver("Yogita", Util.RATING.THREE_STARS);
        Driver riddhiDriver = new Driver("Riddhi", Util.RATING.FOUR_STARS);
        DriverMgr driverMgr = DriverMgr.getDriverMgr();
        driverMgr.addDriver("yogita", yogitaDriver);
        driverMgr.addDriver("riddhi", riddhiDriver);

        // Creating TripMgr
        TripMgr tripMgr = TripMgr.getTripMgr();

        System.out.println("Creating Trip for Vijay from location (10,10) to (30,30)");
        tripMgr.createTrip(vijayRider, new Location(10, 10), new Location(30, 30));

        System.out.println("Creating Trip for Galande from location (200,200) to (500,500)");
        tripMgr.createTrip(galandeRider, new Location(200, 200), new Location(500, 500));

        // Displaying all the trips created
        Map<Integer, Trip> tripsMap = tripMgr.getTripsMap();
        for (Map.Entry<Integer, Trip> entry : tripsMap.entrySet()) {
            entry.getValue().displayTripDetails();
        }
    }
}
