package com;

interface A1 {
    default void q(){};
    void c();
}

abstract class B1 implements A1 {
    public void q() {

    }
}

abstract class C1 extends B1{
    public void q() {

    }
    
}

class Test {
    public static void main(String[] args) {



    }
}





