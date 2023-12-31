package com.src.uber.rider;

import com.src.uber.util.Util;

public class Rider {
    private String name;
    private Util.RATING rating;

    public Rider(String pName, Util.RATING pRating) {
        this.name = pName;
        this.rating = pRating;
    }

    public String getRiderName() {
        return name;
    }

    public Util.RATING getRating() {
        return rating;
    }
}
