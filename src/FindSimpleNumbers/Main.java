package FindSimpleNumbers;

import java.util.Scanner;
/*
вывод массива простых чисел

вывод суммы простых чисел

сделать ввод пользователем размер массива под простые числа

поиск в отдельном классе
 */


public class Main {
    public static void main(String[] args) {


        Counter.start();

        Counter counter = new Counter();
        counter.getNumbers();

    }

}