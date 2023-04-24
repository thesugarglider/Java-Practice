package com.sugarglider.randomexamples.charge;

public class StringExample {
    public static void main(String[] args) {
        String str = "PravinkumarSingh";

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder = stringBuilder.append(str.subSequence(0,11))
                .append("0")
                .append(str.substring(11,str.length()));

        System.out.println(stringBuilder.toString());
        System.out.print("Masked Name:- "+StringMaskUtility.maskedName(str));
    }
}
