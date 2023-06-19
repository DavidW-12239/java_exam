package com;

public class abc {
    static int a = 2;

    public abc(){
        a++;

    }
}

class A extends abc{
    public A(){
        a++;
    }
}

class B extends A{
    public B(){
        a++;
    }

    public B(String xx){
        a++;
    }
}

