package com.space.se01.sandbox;

public class Qwerty {
    int a;
    int b;
    int c;
}

class Qwertyu extends Qwerty {
    int zxcvz;
}

class Awda {
    public static void main(String[] args) {
        Qwertyu a = new Qwertyu();
        a.a = 1;
        a.zxcvz = 1;
    }
}