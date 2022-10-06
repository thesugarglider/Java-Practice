package com.sugarglider.introtooops.interfaces.interfacepuzzles.extendkeyword;

import com.sugarglider.introtooops.interfaces.interfacepuzzles.extendkeyword.Interface2;

public class Test implements Interface2 {
    @Override
    public void print1() {
        System.out.println("Interface 1");
    }

    @Override
    public void print2() {
        System.out.println("Interface 2");
    }
}
