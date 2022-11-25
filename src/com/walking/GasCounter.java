package com.walking;

public class GasCounter extends counterAggregation{

    public GasCounter(String counterName) {

        super(counterName, 0, "Кубометров");
    }

    public GasCounter(String counterName, int counterValue) {

        super(counterName, counterValue, "Кубометров");
    }




}
