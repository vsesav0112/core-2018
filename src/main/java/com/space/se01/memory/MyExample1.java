package com.space.se01.memory;

public class MyExample1 {
    int a;
    String b;
    public static void main(String[] args) {
        Integer j = 71;
        Integer k = j++;
        int i = 2;
        k = i + j + k;
        System.out.println(k);
    }
}

class  MyExample1X {
    public static void main(String[] args) {
        MyExample1 exemplar1 = new MyExample1(); // exemplar - ссылка на объект
        // exemplar1.a;
        System.out.println(exemplar1.a);
        System.out.println(exemplar1.b);
    }
    // MyExample1 exemplar2 = new MyExample1(); // exemplar - ссылка на объект
    // exemplar2.a = 1;
}
