package com.space.se01;

import java.util.Arrays;

public class First {
    public static void main(String[] args) throws InterruptedException {

        // Урок 2 2:40:00
        // Станадртный цикл for
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }


        // Упрощенная замена верхнего цикла
        for (String arg : args) System.out.println(arg);

        // Еще один способ написания цикла (в функциональном стиле)
        Arrays.stream(args).forEach(System.out::println);

        Thread.sleep(60_000);
    }
}
