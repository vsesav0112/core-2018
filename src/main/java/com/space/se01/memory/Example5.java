package com.space.se01.memory;

public class Example5 {
    static int staticDefaultInt = 10;
    static double defaultDouble;
    static String defaultString;

    //header 12 bytes
    int dynamicDefaultInt = 100; // 4 bytes

    public static void main(String[] args) {
        int a = 8;
        System.out.println(a);
        System.out.println(staticDefaultInt);
        System.out.println(defaultDouble);
        System.out.println(defaultString);

        //System.out.println(dynamicDefaultInt); //Нельзя использовать, так как не static

        Example5 example5_1 = new Example5();
        example5_1.dynamicDefaultInt = 1;
        System.out.println(example5_1.dynamicDefaultInt);

        Example5 example5_2 = new Example5();
        example5_2.dynamicDefaultInt = 2;
        System.out.println(example5_2.dynamicDefaultInt);

        Example5 example5_3  = new Example5();
        example5_3.dynamicDefaultInt = 3;
        System.out.println(example5_3.dynamicDefaultInt);

        Example5 example5_4  = new Example5();
        Example5 example5_5  = new Example5();
        Example5 example5_6  = new Example5();
        example5_4.staticDefaultInt = 10;
        example5_5.staticDefaultInt = 20;
        example5_6.staticDefaultInt = 30;
        System.out.println( example5_4.staticDefaultInt);
        System.out.println( example5_5.staticDefaultInt);
        System.out.println( example5_6.staticDefaultInt);

    }

}

