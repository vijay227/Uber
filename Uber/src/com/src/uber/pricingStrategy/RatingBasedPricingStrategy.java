package com.src.uber.pricingStrategy;

import com.src.uber.trip.TripMetaData;
import com.src.uber.util.Util;

public class RatingBasedPricingStrategy extends PricingStrategy {
    @Override
    public double calculatePrice(TripMetaData pTripMetaData) {
        double price = Util.isHighRating(pTripMetaData.getRiderRating()) ? 55.0 : 65.0;
        System.out.println("Based on " + Util.ratingToString(pTripMetaData.getRiderRating()) +
                " rider rating, price of the trip is " + price);
        return price;
    }
}