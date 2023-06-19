package com;

abstract class Abs{
    public static int b = 3;
    static int a=2;
    static void a(){
        System.out.println("static method in abs class");
    }

    Abs(int a){
        System.out.println("Abs constructor");
    }
    Abs(){}


    public static void staticMethod() {
         System.out.println("abs static");
    }
    protected abstract void check();
}
