package com.sugarglider.introtooops.rectangle;

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,4);
        System.out.println(rectangle);
        rectangle.setWidth(25);
        System.out.println(rectangle);
    }
}
