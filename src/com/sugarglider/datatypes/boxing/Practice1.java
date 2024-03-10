package com.sugarglider.datatypes.boxing;

public class Practice1 {
    public static void main(String[] args) {

        //manual boxing of primitive type
        Integer boxedInt = Integer.valueOf(15);

        //manual unboxing of boxed int
        int unboxedInt = boxedInt.intValue();

        //autoboxing of primitve type
        Integer boxedInt1 = 15;

        //auto-unboxing of boxed int
        int unboxedInt1 = boxedInt1;
        System.out.println(boxedInt1.getClass().getName());

        double getPrimitve = getDoubleObject();
        Double getObject = getDoublePrimitive();
    }

    private static Double getDoubleObject(){
        return Double.valueOf(100.00);
    }

    private static double getDoublePrimitive(){
        return 100.00;
    }
}
