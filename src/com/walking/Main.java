package com.walking;

public class Main {
    public static void main(String[] args) {

        counterAggregation [] counter = new counterAggregation[4];

        //можно задать не только имя, но и текущее значение, или будет по умолчанию 0
        counter[0] = new GasCounter("Газовый счетчик");
        counter[1] = new ElecticCounter("Счетчик эллектрический");
        counter[2] = new HotWaterCounter("Счетчик горячей воды",5);
        counter[3] = new ColdWaterCounter("Счетчик холодной воды",15);

        //увеличение на 1, метод идет у супер класса, наследуется.
        counter[0].increment();

        //увеличение на заданное число, метод наследован.
        counter[0].encrease(5);

        //приватный, статический метод, покажет текущее состояние счетчиков всех или по имени конкретно
        showCounters(counter);

        //стирает показатели счетчика
        counter[0].eraseValue();

        //запрашиваем текущее состояние конкретного счетчика по имени
        showCounters(counter[0]);
    }

    private static void showCounters(Object...objects) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Результаты опроса счетчиков:");
        for (Object i: objects) {

            if( i instanceof GasCounter) {
                System.out.println(((GasCounter) i).counterName+": "+ ((GasCounter) i).counterValue+" "+((GasCounter) i).counterUnit);
            } else if ( i instanceof ElecticCounter){
                System.out.println(((ElecticCounter) i).counterName+": "+ ((ElecticCounter) i).counterValue+" "+((ElecticCounter) i).counterUnit);
            } else if ( i instanceof HotWaterCounter) {
                System.out.println(((HotWaterCounter) i).counterName+": "+ ((HotWaterCounter) i).counterValue+" "+((HotWaterCounter) i).counterUnit);
            } else if (i instanceof ColdWaterCounter) {
                System.out.println(((ColdWaterCounter) i).counterName+": "+ ((ColdWaterCounter) i).counterValue+" "+((ColdWaterCounter) i).counterUnit);
            }

        }
        System.out.println("--------------------------------------------------------");

    }
}
