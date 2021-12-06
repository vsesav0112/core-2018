package com.space.se01.operators;

public class Example10 {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String c = new String("abc");

        System.out.println(a == b);
        System.out.println(a == c);

        System.out.println();
    }
}
