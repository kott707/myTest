package com.walking;

public class ElecticCounter extends counterAggregation{


    public ElecticCounter(String counterName) {
        super(counterName, 0, "Ватт");
    }

    public ElecticCounter(String counterName, int counterValue) {

        super(counterName, counterValue, "Ватт");
    }






}
