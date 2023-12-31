package com.src.uber.driverMatchingStrategy;
import com.src.uber.driver.Driver;
import com.src.uber.driver.DriverMgr;
import com.src.uber.trip.TripMetaData;

public class LeastTimeBasedMatchingStrategy extends DriverMatchingStrategy {
    @Override
    public Driver matchDriver(TripMetaData pMetaData) {
        DriverMgr driverMgr = DriverMgr.getDriverMgr();

        if (driverMgr.getDriversMap().isEmpty()) {
            System.out.println("No drivers! What service is this huh?");
        }

        System.out.println("Using quadtree to see nearest cabs, using driver manager to get details of drivers and send notifications");

        // Here we can call quadtree algorithm to get nearest cabs
        Driver driver = driverMgr.getDriversMap().values().iterator().next();

        System.out.println("Setting " + driver.getDriverName() + " as driver");
        pMetaData.setDriverRating(driver.getRating());

        return driver;
    }
}
