package com.space.se02;

public class Example2 {
    public Example2(Num obj) {}
    public Example2(Int obj) {}
    public Example2(Num obj1, Int obj2) {}
    public Example2(Int obj1, Num obj2) {}

    public static void main(String[] args) {
        Num o1 = new Num();
        Int o2 = new Int();
        LongInt o3 = new LongInt();
        Num o4 = new Int();

        Example2 m1 = new Example2(o1); // 1
        Example2 m2 = new Example2(o2); // 2
        Example2 m3 = new Example2(o3); // 2
        Example2 m4 = new Example2(o4); // 1
        Example2 m5 = new Example2(o1, o2); //3
        // Example2 m6 = new Example2(o3, o2); //4
        // Example2 m7 = new Example2(o1, o4); // нет такого конструктора
        Example2 m8 = new Example2(o3, o4);
    }
}

class Num {}

class Int extends Num {}

class LongInt  extends Int {
    static int x;

    public void number(int x) {
        this.x = x;
        System.out.println(x);
    }

    //second
    public void numberPlus(int x) {
        this.x = x + 1;
        System.out.println(this.x);
    }
}
