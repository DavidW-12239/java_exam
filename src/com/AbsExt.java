package com;

public class AbsExt extends Abs{
    int newa= 3;
    AbsExt(){
    }

    public static void staticMethod(){
        System.out.println("absExt static");

    }

    @Override
    public void check() {
        System.out.println("absExt check");
    }

    public void newMethod(){
        System.out.println("new method");
    }
}
