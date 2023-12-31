package com.src.uber.driverMatchingStrategy;

import com.src.uber.driver.Driver;
import com.src.uber.trip.TripMetaData;

public abstract class DriverMatchingStrategy {
    public abstract Driver matchDriver(TripMetaData pTripMetaData);
}
