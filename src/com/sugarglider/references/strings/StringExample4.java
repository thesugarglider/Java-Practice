package com.sugarglider.references.strings;

public class StringExample4 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Test");
        stringBuffer.append(" 123");
        System.out.println(stringBuffer);


        StringBuilder stringBuilder = new StringBuilder("Test");
        stringBuilder.append(" 456");
        System.out.println(stringBuilder);

    }
}
