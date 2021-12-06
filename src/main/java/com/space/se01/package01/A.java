package com.space.se01.package01;

public class A {

    public static int publicField;
    protected static int protectedField;
    static int field;
    private static int privateField;

    public static void main(String[] args) {
        System.out.println(A.publicField);
        System.out.println(A.protectedField);
        System.out.println(A.field);
        System.out.println(A.privateField);
    }
}

class AA {

    public static void main(String[] args) {
        System.out.println(A.publicField);
        System.out.println(A.protectedField);
        System.out.println(A.field);
        //System.out.println(A.privateField);
    }
}
