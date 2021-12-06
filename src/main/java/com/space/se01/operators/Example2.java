package com.space.se01.operators;

public class Example2  {
    public static void main(String[] args) {
        int value = 0;

        System.out.println(value | 0b000001);
        /*
         * |    0   1
         * 0    0   1
         * 1    1   1
         */



        value = 0b00000000000000000000000000000011;
        System.out.println(value &= 0b00000000000000000000000000000010);
        /*
         * &    0   1
         * 0    0   0
         * 1    0   1
         */



        System.out.println(value ^  0b11);
        /*
         * ^    0   1
         * 0    0   1
         * 1    1   0
         */



        System.out.println(~1);

        System.out.println(1 << 2);

        System.out.println(-8 >> 1);

        System.out.println(-8 >>> 1);

        byte b = -1;
        System.out.println(Integer.toBinaryString(b));
        int b1 = b;
        System.out.println(Integer.toBinaryString(b1));
        System.out.println(b1);
        /*System.out.println(b >>> 10);
        System.out.println(Integer.toBinaryString(b));
        b >>>= 10;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(b); */
    }
}
