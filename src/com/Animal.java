package com;

public class Animal {
    private String name;
    protected String protectedName;
    public int count=3;
    static int x = 9;


    Animal(){
        System.out.println("a");
    }

    static {
        System.out.println("Animal static mod");
    }
    {System.out.println("Animal non-static mod");}

    public void kill(){
        System.out.println("final father");

    }

    public void add(){
        count++;
    }

    Animal get(){
        return new Animal();

    }

    public static void main(String[] args) {

    }
}







