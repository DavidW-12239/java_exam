package com;

public class Dog extends Animal{
    public String breed;
    static int x = 1;
    public String count="2";



    public Dog(){
        System.out.println("d");
    }
    static {
        System.out.println("Dog static mod");
    }
    {System.out.println("Dog non-static mod");}


    public void kill(){
        System.out.println("private dog");

    }

    public void bark(){

    }

    Dog get(){
        return new Dog();

    }
}
