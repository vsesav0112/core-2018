package com.space.se02;

public class Example1  {
    public static void main(String[] args) {
        method();
        method(1);
        method1();
    }
    /*static int method() {
        System.out.println("int");
        return 1;
    }*/

    static void method() {
        System.out.println("void");
    }

    static void method(int a) {
        System.out.println(a);
    }

    static void method1() {
        System.out.println("void1");
    }

    static void method(int a, int b, String c) {
        System.out.println("void");
    }

    /*static void method(int d, int e, String f) {
        System.out.println("void");
    }*/

    static void method(int d,  String f, int e) {
        System.out.println("void");
    }
}
