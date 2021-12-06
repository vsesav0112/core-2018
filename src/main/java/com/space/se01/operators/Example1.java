package com.space.se01.operators;

public class Example1 {
    public static void main(String[] args) {
        int value = 0;

        //0
        System.out.println(++value); //1
        //1

        //1
        System.out.println(value++); //1
        //2

        //2
        System.out.println(value); //2
        //2

    }
}

class Example1111 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
        }
    }
}
