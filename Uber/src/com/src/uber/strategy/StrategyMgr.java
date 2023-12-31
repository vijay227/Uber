package com.src.uber.strategy;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.src.uber.driverMatchingStrategy.DriverMatchingStrategy;
import com.src.uber.driverMatchingStrategy.LeastTimeBasedMatchingStrategy;
import com.src.uber.pricingStrategy.DefaultPricingStrategy;
import com.src.uber.pricingStrategy.PricingStrategy;
import com.src.uber.trip.TripMetaData;

public class StrategyMgr {
    private static StrategyMgr strategyMgrInstance;
    private static final Lock mtx = new ReentrantLock();

    private StrategyMgr() {}

    public static StrategyMgr getStrategyMgr() {
        if (strategyMgrInstance == null) {
            mtx.lock();
            try {
                if (strategyMgrInstance == null) {
                    strategyMgrInstance = new StrategyMgr();
                }
            } finally {
                mtx.unlock();
            }
        }
        return strategyMgrInstance;
    }

    public PricingStrategy determinePricingStrategy(TripMetaData metaData) {
        System.out.println("Based on location and other factors, setting pricing strategy");
        return new DefaultPricingStrategy();
    }

    public DriverMatchingStrategy determineMatchingStrategy(TripMetaData metaData) {
        System.out.println("Based on location and other factors, setting matching strategy");
        return new LeastTimeBasedMatchingStrategy();
    }
}
