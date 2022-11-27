package com.yandex.idealshape;

public class Rectangle extends IdealShape{

    public Rectangle(int size, int type) {
        super(size, type);
    }

    public void draw(){
        drawHorizon(size);
        drawVertical(size-2);
        drawHorizon(size);

    }

    public void drawHorizon(int size){

        for(int i = 0; i<size; i++){
            System.out.print(horizon);
        }
        System.out.println();
    }

    public void drawVertical(int size){


        for(int i = 0; i<size; i++){
            System.out.print(vertical);
            for(int q = 0; q<size; q++){
                System.out.print(" ");
            }
            System.out.print(vertical);
            System.out.println();

        }

    }

}
