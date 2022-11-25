package com.walking;

 class counterAggregation {

    //имя счетчика и его единица измерения
    final String counterName, counterUnit;

    //значение счетчика
    int counterValue;

    counterAggregation(String counterName, int counterValue, String counterUnit) {
        this.counterName = counterName;
        this.counterValue = counterValue;
        this.counterUnit = counterUnit;
    }

    public int increment (){

        return counterValue++;
    }

    public int encrease (int value){
        counterValue += value;

        return counterValue;
    }

     public int eraseValue(){
         System.out.println("Показатели "+ counterName + " были стерты :(");

         return counterValue = 0;
     }



}
