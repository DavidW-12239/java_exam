package com;

public interface InterfaceEx{
    int a = 2;
    default void a(){
        System.out.println("defaultMethod");
    }
    static void b(){
        System.out.println("Interface b");
    }
    void c();
}



