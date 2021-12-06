package com.space.se01.memory;

public class Example3 {
    public static void main(String[] args) {
        int arrLenght = Integer.parseInt(args[0]);
        int[] arr = new int[arrLenght];
        method(arr, 0);
    }

    public static void method(int[] values, int level) {
        System.out.println(level);
        method(values, level + 1);
    }
}


