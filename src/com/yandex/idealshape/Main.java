package com.yandex.idealshape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип обьекта, 0 - квадрат, 1 - трегуольник");
        int choice = scanner.nextInt();
        int sideSize = 0;

        switch (choice){
            case 0:
                System.out.println("Введите ширину стороны квадрата");
                sideSize = scanner.nextInt();
//                Rectangle rectangle = new Rectangle(sideSize,choice);
//                rectangle.draw();
                break;
            case 1:
                System.out.println("Введите ширину стороны треугольника");
                sideSize = scanner.nextInt();
                if(sideSize%2 != 0) sideSize++;
//                Triangle triangle = new Triangle(sideSize,choice);
//                triangle.draw();
                break;
            default:
                System.out.println("Выбрать можно 0 и 1, программа завершена");
                return;
        }
        scanner.close();

        IdealShape idealShape = new IdealShape(sideSize, choice);
        idealShape.draw();







    }
}
