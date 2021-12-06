package com.space.se01.package03;

import com.space.se01.package01.A;

public class C extends A{

    public static void main(String[] args) {
        System.out.println(A.publicField);
        System.out.println(A.protectedField);
        //System.out.println(A.field);
        //System.out.println(A.privateField);
    }
}
