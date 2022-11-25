package com.walking;

public class ColdWaterCounter extends counterAggregation{

    public ColdWaterCounter(String counterName ) {

        super(counterName, 0, "Кубометров");
    }

    public ColdWaterCounter(String counterName, int counterValue ) {

        super(counterName, counterValue, "Кубометров");
    }
}
