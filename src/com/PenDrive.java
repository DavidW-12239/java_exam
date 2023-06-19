package com;

class PenDrive {
    int capacity;
    PenDrive(int capacity) {
        this.capacity = capacity;
    }
    void setCapacity(int c){
        this.capacity = c;

    }
}

class OTG extends PenDrive {
    String type;
    String make;
    OTG(int capacity, String type) {
        super(capacity);
        this.type = type;
    }
    OTG(String make) {
        super(128);
        this.make = make;
    }
}

class Test2 {
    public static void main(String[] args) {
        OTG obj = new OTG(128, "TYPE-C");
        System.out.println(obj.capacity + ":" + obj.type);
    }
}
