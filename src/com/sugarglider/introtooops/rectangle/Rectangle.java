package com.sugarglider.introtooops.rectangle;

public class Rectangle {
    private int length;
    private int width;


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int area(){
        return this.length * this.width;
    }

    public int perimeter(){
        return 2 * (this.length + this.width);
    }

    public String toString(){
        return String.format("Area is %d and Perimeter is %d\n",area(),perimeter());
    }
}
