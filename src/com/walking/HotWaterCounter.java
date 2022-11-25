package com.walking;

public class HotWaterCounter extends counterAggregation {

    public HotWaterCounter(String counterName) {

        super(counterName, 0, "Кубометров");
    }

    public HotWaterCounter(String counterName, int counterValue) {

        super(counterName, counterValue, "Кубометров");
    }

}
