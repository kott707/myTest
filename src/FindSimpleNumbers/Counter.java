package FindSimpleNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class Counter {

    public static int number;

    final int[] primeNumbers = new int[number];

    public static void start() {
        System.out.println("Введите количество чисел для поиска и вывода суммы:");
        Scanner scanner = new Scanner(System.in);
        Counter.number = scanner.nextInt();

        while (Counter.number <= 0) {
            System.out.println("Число должно быть положительным, попробуйте еще");
            Counter.number = scanner.nextInt();
        }

        scanner.close();
    }

    public void getNumbers() {

        for (int i = 0; i < primeNumbers.length; i++) {
            if (i == 0) {
                primeNumbers[i] = 2;
            } else {
                int addingValue = i == 1 ? 1 : 2;
                int number = primeNumbers[i - 1] + addingValue;
                primeNumbers[i] = findNextPrimeNumber(number, primeNumbers, i);
            }
        }
        System.out.println("Сумма простых чисел вышла: " + sum(primeNumbers));
        System.out.println("Ваши числа: " + Arrays.toString(primeNumbers));
    }
    private int findNextPrimeNumber(int number, int[] primeNumbers, int currentIndex) {
        boolean isPrime = isPrime(number, primeNumbers, currentIndex);

        if (isPrime) {
            return number;
        }

        number += 2;

        return findNextPrimeNumber(number, primeNumbers, currentIndex);
    }

    //    Метод проверки конкретного числа на то, является ли оно простым
    private boolean isPrime(int number, int[] primeNumbers, int currentIndex) {
        int j = 0;
        boolean isPrime = true;

        while (isPrime && j < currentIndex && number / primeNumbers[j] > 1) {
            if (number % primeNumbers[j] == 0) {
                isPrime = false;
            } else {
                j++;
            }
        }
        return isPrime;
    }


    private int sum(int[] numbers) {
        return sum(numbers, 0);
    }

    private int sum(int[] numbers, int i) {
        if (i == numbers.length - 1) {
            return numbers[i];
        }

        return numbers[i] + sum(numbers, i + 1);
    }

}