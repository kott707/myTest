package com.yandex.idealshape;

public class Triangle extends IdealShape {

    public Triangle(int size, int type) {
        super(size, type);
    }

    public void draw() {

        for( int q= 0; q<size/2; q++) {
            for (int i = q; i < size / 2; i++) {
                System.out.print(" ");
            }
            System.out.print(lineForward);
            for (int z = 0; z<q; z++){
                System.out.print("  ");
            }
            System.out.println(lineBackward);
        }

//        for (int i = 0; i < size / 2; i++) {
//            System.out.print(" ");
//        }







        drawHorizon(size);
    }

    public void drawSlash() {


    }

    public void drawHorizon(int size) {

        System.out.print(lineForward);
        for (int i = 0; i < size; i++) {
            System.out.print(horizon);
        }
        System.out.println(lineBackward);
    }

}
