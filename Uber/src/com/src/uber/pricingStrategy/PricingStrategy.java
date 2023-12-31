package com.src.uber.pricingStrategy;

import com.src.uber.trip.TripMetaData;

public abstract class PricingStrategy {
    public abstract double calculatePrice(TripMetaData pTripMetaData);
}
