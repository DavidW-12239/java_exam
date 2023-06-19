package com;

public class InterfaceExImpl implements InterfaceExEx {

    int x=2;
    public void a(){
        System.out.println("impl a");

    }

    public static void b(){
        System.out.println("Impl b");
    }

    public void newMethod(){
        System.out.println("new method");
    }

    @Override
    public void c() {
        {
            System.out.println("Impl c");
        }
    }
}
