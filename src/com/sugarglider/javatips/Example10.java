package com.sugarglider.javatips;

public class Example10 {

    public  int i;
    class NestedClass{
        public void method(){
            i = 5;
        }
    }

    static class NestedClass2{
        public void method(){

        }
    }

    public static void main(String[] args) {
        Example10 example10 = new Example10();
        NestedClass nestedClass = example10.new NestedClass();

        NestedClass2 nestedClass2 = new NestedClass2();
    }
}
