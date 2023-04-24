package com.sugarglider.randomexamples.charge;

public class StringMaskUtility {
    public static String maskedName(String str){
        String maskedString = null;
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(str.substring(0,3));

        for(int i=0;i<str.length();i++){
            if(i>=4 && i<=7){
                stringBuilder.append("X");
            }
        }

        maskedString = stringBuilder.append(str.substring(8,str.length())).toString();

        return maskedString;
    }
}
