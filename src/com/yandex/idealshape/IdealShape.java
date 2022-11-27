package com.yandex.idealshape;

public class IdealShape {
    final char horizon = '-', vertical = '|', lineForward = '/', lineBackward = '\\';
    int size, type;

    public IdealShape(int size, int type) {
        this.size = size;
        this.type = type;
    }

    public void draw(){

        if(type == 1){
            Triangle triangle = new Triangle(size,type);
            triangle.draw();
        } else if ( type == 0){
            Rectangle rectangle = new Rectangle(size,type);
            rectangle.draw();
        } else {
            System.out.println("Нечего рисовать");
        }

    }
}
